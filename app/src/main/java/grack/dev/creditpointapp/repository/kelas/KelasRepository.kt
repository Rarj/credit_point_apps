package grack.dev.creditpointapp.repository.kelas

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.kelas.model.Kelas
import grack.dev.creditpointapp.repository.kelas.model.KelasResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object KelasRepository {

  fun provideKelas(): Observable<KelasResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.requestListKelas()
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

}