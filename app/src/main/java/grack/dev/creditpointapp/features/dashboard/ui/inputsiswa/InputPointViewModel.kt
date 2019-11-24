package grack.dev.creditpointapp.features.dashboard.ui.inputsiswa

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.detailsiswa.DetailSiswaRepository
import grack.dev.creditpointapp.repository.detailsiswa.detail.DetailSiswaResponse
import io.reactivex.Observable

class InputPointViewModel : ViewModel() {

  val detailSiswa = MutableLiveData<DetailSiswaModel>()

  fun loadDetailSiswa(idSiswa: String?): Observable<DetailSiswaResponse> {
    return DetailSiswaRepository.detailSiswa(idSiswa)
      .map {
        it
      }
  }

}