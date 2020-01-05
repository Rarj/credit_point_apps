package grack.dev.creditpointapp.features.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.preferences.UserPreferences
import grack.dev.creditpointapp.preferences.WaliMuridPreferences
import grack.dev.creditpointapp.repository.login.LoginRepository
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import grack.dev.creditpointapp.repository.loginwalimurid.LoginWaliMuridRepository
import grack.dev.creditpointapp.repository.loginwalimurid.model.LoginWaliMuridResponse
import io.reactivex.Observable

class LoginViewModel : ViewModel() {

  val email = MutableLiveData<String>()
  val password = MutableLiveData<String>()
  val loginResponse = MutableLiveData<LoginResponse>()
  val userPreferences = MutableLiveData<UserPreferences>()
  val waliMuridPreferences = MutableLiveData<WaliMuridPreferences>()

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
          it.user?.statusAdmin,
          it.user?.foto
        )

        loginResponse.value = it
        it
      }
  }

  fun loginWaliMurid(): Observable<LoginWaliMuridResponse> {
    val loginRequest = LoginRequest(email.value.toString(), password.value.toString())
    return LoginWaliMuridRepository.provideLoginWaliMurid(loginRequest)
      .map {
        waliMuridPreferences.value = WaliMuridPreferences(
          it.waliMurid[0].idSiswa,
          it.user?.alamatAdmin,
          it.user?.emailAdmin,
          it.user?.idAdmin,
          it.waliMurid[0].namaWaliMurid,
          it.user?.statusAdmin,
          it.waliMurid[0].siswaPointSiswa,
          it.waliMurid[0].idWaliMurid,
          it.user?.passwordAdmin,
          it.waliMurid[0].jenisKelamin
        )

        it
      }
  }

}