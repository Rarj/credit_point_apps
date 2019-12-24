package grack.dev.creditpointapp.features.newdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.bk.ui.report.ReportFragment
import grack.dev.creditpointapp.features.dashboard.ui.datainformasi.DataInformasiFragment
import grack.dev.creditpointapp.features.dashboard.ui.datapelanggaran.DataPelanggaranFragment
import grack.dev.creditpointapp.features.dashboard.ui.kelas.KelasFragment
import grack.dev.creditpointapp.features.dashboard.ui.rangking.RangkingSiswaFragment
import grack.dev.creditpointapp.preferences.SharedPref
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

  private var privilege: String? = null

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    privilege = intent.getStringExtra("privilege")
    val user = SharedPref.getUser(this)

    setContentView(R.layout.activity_main)

    if (privilege == "Guru") {
      container_report.visibility = GONE
    } else if (privilege == "Guru Bk") {
      container_report.visibility = VISIBLE
    }

    container_report.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val bottomSheetFragment = ReportFragment()
        bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
      }

    container_pelanggaran.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        startActivity(Intent(this, DataPelanggaranFragment::class.java))
      }

    container_konsultasi.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        Toast.makeText(this, "Wait for backend to provide the datas", Toast.LENGTH_SHORT).show()
      }

    container_ranking.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        startActivity(Intent(this, RangkingSiswaFragment::class.java))
      }

    container_info.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        startActivity(Intent(this, DataInformasiFragment::class.java))
      }

    fab.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        startActivity(Intent(this, KelasFragment::class.java))
      }

    bottom_app_bar.setOnMenuItemClickListener {
      when (it.itemId) {
        R.id.app_bar_akun -> {

          true
        }
        else -> {
          true
        }
      }
    }

  }
}
