package grack.dev.creditpointapp.repository.datapelanggaran

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object DataPelanggaranRepository {

  fun provideDataPelanggaramn(): Observable<DataPelanggaran> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.requestDataPelanggaran()
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map { dataPelanggaran ->
        dataPelanggaran
      }
  }

}