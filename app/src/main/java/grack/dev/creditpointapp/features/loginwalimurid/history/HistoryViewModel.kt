package grack.dev.creditpointapp.features.loginwalimurid.history

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.loginwalimurid.history.HistoryRepository
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.HistoryResponse
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi
import io.reactivex.Observable

class HistoryViewModel : ViewModel() {

  val prestasiList = MutableLiveData<List<Prestasi>>()
  val pelanggaranList = MutableLiveData<List<Pelanggaran>>()

  fun loadHistory(idSiswa: String): Observable<HistoryResponse> {
    return HistoryRepository.provideHistoryPelanggaran(idSiswa)
      .map {
        prestasiList.value = it.pelanggaranParent!![0]?.prestasi as List<Prestasi>?
        pelanggaranList.value = it.pelanggaranParent!![0]?.pelanggaran as List<Pelanggaran>?
        it
      }
  }

}