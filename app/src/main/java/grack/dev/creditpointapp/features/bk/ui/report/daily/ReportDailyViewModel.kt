package grack.dev.creditpointapp.features.bk.ui.report.daily

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import grack.dev.creditpointapp.repository.report.ReportRepository
import grack.dev.creditpointapp.repository.report.model.ReportResponse
import io.reactivex.Observable

class ReportDailyViewModel : ViewModel() {

  val dateSelected = MutableLiveData<String>()
  val monthSelected = MutableLiveData<String>()
  val yearSelected = MutableLiveData<String>()

  fun loadReportDaily(date: String): Observable<ReportResponse> {
    return ReportRepository().provideReportDaily(date)
      .map {
        it
      }
  }

  fun loadReportMonthly(month: String): Observable<ReportResponse> {
    return ReportRepository().provideReportMonthly(month)
      .map {
        it
      }
  }

  fun loadReportYearly(year: String): Observable<ReportResponse> {
    return ReportRepository().provideReportYearly(year)
      .map {
        it
      }
  }

}