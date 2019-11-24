package grack.dev.creditpointapp.repository.detailsiswa

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.detailsiswa.detail.DetailSiswaResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object DetailSiswaRepository {

  fun detailSiswa(idSiswa: String?): Observable<DetailSiswaResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.requestDetailSiswa(idSiswa)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

}