package grack.dev.creditpointapp.features.bk.ui.report

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import grack.dev.creditpointapp.R

class ReportActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_report)

    val fragmentReport = ReportFragment()
    val supportFragmentManager = supportFragmentManager.beginTransaction()
    supportFragmentManager.add(R.id.container_report, fragmentReport).commit()

  }
}
