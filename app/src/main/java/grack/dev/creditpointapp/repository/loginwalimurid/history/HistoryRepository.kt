package grack.dev.creditpointapp.repository.loginwalimurid.history

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.HistoryResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object HistoryRepository {

  fun provideHistoryPelanggaran(id_siswa: String): Observable<HistoryResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.historyPelanggaran(id_siswa)
      .observeOn(AndroidSchedulers.mainThread())
      .subscribeOn(Schedulers.io())
      .map {
        it
      }
  }

}