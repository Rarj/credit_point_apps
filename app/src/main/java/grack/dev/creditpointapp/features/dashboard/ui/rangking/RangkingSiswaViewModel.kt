package grack.dev.creditpointapp.features.dashboard.ui.rangking

import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.rangking.RangkingRepository
import grack.dev.creditpointapp.repository.rangking.model.RangkingResponse
import io.reactivex.Observable

class RangkingSiswaViewModel : ViewModel() {

  fun loadRangkingSiswa(): Observable<RangkingResponse> {
    return RangkingRepository.provideRangking()
      .map {
        it
      }
  }

}