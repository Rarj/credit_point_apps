package grack.dev.creditpointapp.features.login

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import com.jakewharton.rxbinding3.widget.afterTextChangeEvents
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityLoginBinding
import grack.dev.creditpointapp.preferences.SharedPref
import grack.dev.creditpointapp.preferences.UserPreferences
import java.util.concurrent.TimeUnit

class LoginActivity : AppCompatActivity() {

  private lateinit var bindingLoginActivity: ActivityLoginBinding
  private lateinit var loginViewModel: LoginViewModel

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

    bindingLoginActivity = setContentView(this, R.layout.activity_login)
    bindingLoginActivity.viewModel = loginViewModel
    bindingLoginActivity.lifecycleOwner = this

    bindingLoginActivity.inputEmail.afterTextChangeEvents()
      .skip(1)
      .subscribe {
        loginViewModel.email.value = it.editable.toString()
      }

    bindingLoginActivity.inputPassword.afterTextChangeEvents()
      .skip(1)
      .subscribe {
        loginViewModel.password.value = it.editable.toString()
      }

    bindingLoginActivity.buttonLogin.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        stateButtonLogin(false, "Authenticating...")

        loginViewModel.login()
          .subscribe {
            if (it.status == "success") {
              SharedPref.saveUser(loginViewModel.userPreferences.value, this)
              stateButtonLogin(true, "Success")
            } else {
              stateButtonLogin(true, "Failed")
            }
          }
      }
  }

  private fun stateButtonLogin(isEnabled: Boolean?, text: String?) {
    bindingLoginActivity.buttonLogin.isEnabled = isEnabled ?: false
    bindingLoginActivity.buttonLogin.text = text ?: ""
  }
}
