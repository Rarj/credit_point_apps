package grack.dev.creditpointapp.features.newdashboard.konsultasi

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.konsultasi.KonsultasiRepository
import grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse

class KonsultasiViewModel : ViewModel() {

  val listSemuaSiswa = MutableLiveData<KonsultasiResponse>()

  @SuppressLint("CheckResult")
  fun loadAllSiswa() {
    KonsultasiRepository.provideKonsultasiSemuaSiswa()
      .subscribe { konsultasiResponse ->
        listSemuaSiswa.value = konsultasiResponse
      }
  }

}