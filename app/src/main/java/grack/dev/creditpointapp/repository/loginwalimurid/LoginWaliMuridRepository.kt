package grack.dev.creditpointapp.repository.loginwalimurid

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.preferences.UpdateWaliMuridPreferences
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.loginwalimurid.editwalimurid.UpdateProfileWaliMuridResponse
import grack.dev.creditpointapp.repository.loginwalimurid.model.LoginWaliMuridResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object LoginWaliMuridRepository {

  fun provideLoginWaliMurid(loginRequest: LoginRequest): Observable<LoginWaliMuridResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.requestLoginWaliMurid(loginRequest)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

  fun updateProvileWaliMurid(requestModel: UpdateWaliMuridPreferences): Observable<UpdateProfileWaliMuridResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.updateProfileWaliMurid(requestModel)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

}