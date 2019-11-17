package grack.dev.creditpointapp.features.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.preferences.UserPreferences
import grack.dev.creditpointapp.repository.login.LoginRepository
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import io.reactivex.Observable

class LoginViewModel : ViewModel() {

  val email = MutableLiveData<String>()
  val password = MutableLiveData<String>()
  val loginResponse = MutableLiveData<LoginResponse>()
  val userPreferences = MutableLiveData<UserPreferences>()

  fun login(): Observable<LoginResponse> {
    val loginRequest = LoginRequest(email.value.toString(), password.value.toString())
    return LoginRepository.provideLogin(loginRequest)
      .map {
        userPreferences.value = UserPreferences(
          it.user?.alamatAdmin,
          it.user?.emailAdmin, it.user?.idAdmin,
          it.user?.levelAdmin,
          it.user?.namaAdmin,
          it.user?.passwordAdmin,
          it.user?.statusAdmin
        )

        loginResponse.value = it
        it
      }
  }

}