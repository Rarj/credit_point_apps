package grack.dev.creditpointapp.features.bk.ui.report

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyActivity
import kotlinx.android.synthetic.main.fragment_report.view.*

class ReportFragment : BottomSheetDialogFragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    return inflater.inflate(R.layout.fragment_report, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    view.button_report_harian.setOnClickListener {
      val intent = Intent(activity, ReportDailyActivity::class.java)
      intent.putExtra("report_key", "daily")
      startActivity(intent)
    }

    view.button_report_bulanan.setOnClickListener {
      val intent = Intent(activity, ReportDailyActivity::class.java)
      intent.putExtra("report_key", "monthly")
      startActivity(intent)
    }

    view.button_report_tahunan.setOnClickListener {
      val intent = Intent(activity, ReportDailyActivity::class.java)
      intent.putExtra("report_key", "yearly")
      startActivity(intent)
    }
  }

}
