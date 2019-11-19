package grack.dev.creditpointapp.features.dashboard.ui.kelas

import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.kelas.KelasRepository
import grack.dev.creditpointapp.repository.kelas.model.KelasResponse
import io.reactivex.Observable

class KelasViewModel : ViewModel() {

  fun listKelas(): Observable<KelasResponse> {
    return KelasRepository.provideKelas()
      .map {
        it
      }
  }

}