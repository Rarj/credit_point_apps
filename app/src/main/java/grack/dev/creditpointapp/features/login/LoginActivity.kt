package grack.dev.creditpointapp.features.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.snackbar.Snackbar
import com.jakewharton.rxbinding3.view.clicks
import com.jakewharton.rxbinding3.widget.afterTextChangeEvents
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityLoginBinding
import grack.dev.creditpointapp.features.loginwalimurid.WaliMuridActivity
import grack.dev.creditpointapp.features.newdashboard.MainActivity
import grack.dev.creditpointapp.preferences.SharedPref
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

        if (bindingLoginActivity.checkboxWaliMurid.isChecked) {
          loginViewModel.loginWaliMurid()
            .subscribe({

              if (it.status == "success") {
                SharedPref.saveWaliMurid(loginViewModel.waliMuridPreferences.value, this)
                SharedPref.setUserLoggedInWaliMurid(this, true)
                stateButtonLogin(true, "Login")

                val intent = Intent(this, WaliMuridActivity::class.java)
                startActivity(intent)
                finish()

              } else {
                stateButtonLogin(true, "Login")
                Snackbar.make(
                  bindingLoginActivity.container,
                  it.message.toString(),
                  Snackbar.LENGTH_LONG
                ).show()
              }

            }, {
              stateButtonLogin(true, "Login")

              Log.e("AKSDHAJKSHAS", it.toString())
              Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
            })
        } else {
          loginViewModel.login()
            .subscribe({
              if (it.status == "success") {
                SharedPref.saveUser(loginViewModel.userPreferences.value, this)
                SharedPref.setUserLoggedIn(this, true)
                stateButtonLogin(true, "Login")

                if (it.user?.statusAdmin == "Guru") {
                  val intent = Intent(this, MainActivity::class.java)
                  intent.putExtra("privilege", "Guru")
                  startActivity(intent)
                  finish()
                } else if (it.user?.statusAdmin == "Guru BK") {
                  val intent = Intent(this, MainActivity::class.java)
                  intent.putExtra("privilege", "Guru BK")
                  startActivity(intent)
                  finish()
                }

              } else {
                stateButtonLogin(true, "Login")
                Snackbar.make(
                  bindingLoginActivity.container,
                  it.message.toString(),
                  Snackbar.LENGTH_LONG
                ).show()
              }
            }, {
              stateButtonLogin(true, "Login")

              Log.e("AKSDHAJKSHAS", it.toString())
              Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
            })
        }
      }
  }

  private fun stateButtonLogin(isEnabled: Boolean?, text: String?) {
    bindingLoginActivity.buttonLogin.isEnabled = isEnabled ?: false
    bindingLoginActivity.buttonLogin.text = text ?: ""
  }
}
