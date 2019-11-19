package grack.dev.creditpointapp.features.dashboard.ui.kelas

import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.kelas.KelasRepository
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse
import grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse
import io.reactivex.Observable

class KelasViewModel : ViewModel() {

  fun listKelas(): Observable<KelasResponse> {
    return KelasRepository.provideKelas()
      .map {
        it
      }
  }

  fun listKategoriKelas(kelas: String): Observable<KategoriKelasResponse> {
    return KelasRepository.provideKategoriKelas(kelas)
      .map {
        it
      }
  }

}