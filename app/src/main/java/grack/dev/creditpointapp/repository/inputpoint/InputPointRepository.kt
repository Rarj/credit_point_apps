package grack.dev.creditpointapp.repository.inputpoint

import grack.dev.creditpointapp.network.ApiConfig
import grack.dev.creditpointapp.network.RetrofitInstance
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object InputPointRepository {

  fun provideInputPoint(request: InputPointRequest): Observable<InputPointResponse> {
    val service = RetrofitInstance.retrofitInstance().create(ApiConfig::class.java)
    return service.requestInputPoint(request)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .map {
        it
      }
  }

}