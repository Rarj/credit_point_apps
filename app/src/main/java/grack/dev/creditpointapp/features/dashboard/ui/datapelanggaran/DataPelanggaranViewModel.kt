package grack.dev.creditpointapp.features.dashboard.ui.datapelanggaran

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.datapelanggaran.DataPelanggaranRepository
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import io.reactivex.Observable

class DataPelanggaranViewModel : ViewModel() {

  var dataPelanggaran = MutableLiveData<DataPelanggaran>()

  fun listDataPelanggaran(): Observable<DataPelanggaran> {
    return DataPelanggaranRepository.provideDataPelanggaran()
      .map {
        dataPelanggaran.value = it
        it
      }
  }

}