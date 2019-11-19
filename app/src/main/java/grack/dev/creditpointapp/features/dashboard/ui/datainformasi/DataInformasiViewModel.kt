package grack.dev.creditpointapp.features.dashboard.ui.datainformasi

import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.datainformasi.DataInformasiRepository
import grack.dev.creditpointapp.repository.datainformasi.model.DataInformasiResponse
import io.reactivex.Observable

class DataInformasiViewModel : ViewModel() {

  fun listInformasi(): Observable<DataInformasiResponse> {
    return DataInformasiRepository.provideDataInformasi()
      .map {
        it
      }
  }

}