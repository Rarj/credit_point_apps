package grack.dev.creditpointapp.repository.konsultasi

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object KonsultasiRepository {

  fun provideKonsultasiSemuaSiswa(): Observable<KonsultasiResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.konsultasiSiswa()
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

}