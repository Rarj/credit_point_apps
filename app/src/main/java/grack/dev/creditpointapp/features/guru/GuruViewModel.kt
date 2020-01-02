package grack.dev.creditpointapp.features.guru

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.guru.GuruRepository
import grack.dev.creditpointapp.repository.guru.model.GuruResponse
import io.reactivex.Observable

class GuruViewModel : ViewModel() {

  val listGuru = MutableLiveData<GuruResponse>()

  fun loadListGuru(): Observable<GuruResponse> {
    return GuruRepository.provideListGuru()
      .map {
        listGuru.value = it
        it
      }
  }

}