package grack.dev.creditpointapp.features.dashboard.ui.inputpoint

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.datapelanggaran.DataPelanggaranRepository
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.inputpoint.InputPointRepository
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse
import io.reactivex.Observable

class InputPointViewModel : ViewModel() {

  var dataPelanggaran = MutableLiveData<DataPelanggaran>()

  fun loadPoint(): Observable<DataPelanggaran> {
    return DataPelanggaranRepository.provideDataPelanggaran()
      .map {
        dataPelanggaran.value = it
        it
      }
  }

  fun inputPoint(request: InputPointRequest): Observable<InputPointResponse> {
    return InputPointRepository.provideInputPoint(request)
      .map {
        it
      }
  }

}