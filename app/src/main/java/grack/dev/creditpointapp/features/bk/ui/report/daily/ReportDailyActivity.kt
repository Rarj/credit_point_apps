package grack.dev.creditpointapp.features.bk.ui.report.daily

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding3.view.clicks
import com.whiteelephant.monthpicker.MonthPickerDialog
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityReportDailyBinding
import grack.dev.creditpointapp.repository.report.model.ReportResponse
import kotlinx.android.synthetic.main.activity_report_daily.*
import java.util.*
import java.util.concurrent.TimeUnit

class ReportDailyActivity : AppCompatActivity() {

  lateinit var viewModel: ReportDailyViewModel
  lateinit var binding: ActivityReportDailyBinding
  lateinit var adapterReportDaily: ReportDailyAdapter

  private var reportResult: String = ""
  private var isReportEmpty = false

  @SuppressLint("CheckResult", "SimpleDateFormat")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    var intent = intent.getStringExtra("report_key")

    viewModel = ViewModelProviders.of(this).get(ReportDailyViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_report_daily)

    binding.buttonExport.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        if (intent == "daily") {
          if (viewModel.dateSelected.value.toString() == "null") {
            Toast.makeText(this, "Kamu belum memilih data yang ingin di Export.", Toast.LENGTH_SHORT).show()
          } else {
            var urlExport = ""
            urlExport = if (intent == "daily") {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?date=${binding.textDate.text}&status=export"
            } else {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?${reportResult}=${binding.textDate.text}&status=export"
            }
            export(urlExport)
          }
        } else if (intent == "monthly") {
          if (viewModel.monthSelected.value.toString() == "null") {
            Toast.makeText(this, "Kamu belum memilih data yang ingin di Export.", Toast.LENGTH_SHORT).show()
          } else {
            var urlExport = ""
            urlExport = if (intent == "daily") {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?date=${binding.textDate.text}&status=export"
            } else {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?${reportResult}=${binding.textDate.text}&status=export"
            }
            export(urlExport)
          }
        } else if (intent == "yearly") {
          if (viewModel.yearSelected.value.toString() == "null") {
            Toast.makeText(this, "Kamu belum memilih data yang ingin di Export.", Toast.LENGTH_SHORT).show()
          } else {
            var urlExport = ""
            urlExport = if (intent == "daily") {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?date=${binding.textDate.text}&status=export"
            } else {
              "https://credit-point.desa-kayu-bongkok.net/credit_point/report/${reportResult}-result?${reportResult}=${binding.textDate.text}&status=export"
            }
            export(urlExport)
          }
        }
      }

    when (intent) {
      "daily" -> {
        binding.textTitleReport.text = "Laporan Harian"
        binding.textDate.hint = "Pilih Tanggal"
        binding.buttonPickDate.text = "Pick Date"
        reportResult = intent
      }
      "monthly" -> {
        binding.textTitleReport.text = "Laporan Bulanan"
        binding.textDate.hint = "Pilih Bulan"
        binding.buttonPickDate.text = "Pick Month"
        reportResult = intent
      }
      "yearly" -> {
        binding.textTitleReport.text = "Laporan Tahunan"
        binding.textDate.hint = "Pilih Tahun"
        binding.buttonPickDate.text = "Pick Year"
        reportResult = intent
      }
    }

    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)

    val progressDialog = ProgressDialog(this)

    viewModel.dateSelected.observe(this, androidx.lifecycle.Observer { dateSelected ->
      viewModel.loadReportDaily(dateSelected)
        .doOnSubscribe {
          progressDialog.show()
        }
        .subscribe { response ->
          progressDialog.dismiss()

          setAdapter(response)
        }
    })

    viewModel.monthSelected.observe(this, androidx.lifecycle.Observer { monthSelected ->
      viewModel.loadReportMonthly(monthSelected)
        .doOnSubscribe {
          progressDialog.show()
        }
        .subscribe { response ->
          progressDialog.dismiss()

          setAdapter(response)
        }
    })

    viewModel.yearSelected.observe(this, androidx.lifecycle.Observer { yearlSelected ->
      viewModel.loadReportYearly(yearlSelected)
        .doOnSubscribe {
          progressDialog.show()
        }
        .subscribe { response ->
          progressDialog.dismiss()

          setAdapter(response)
        }
    })

    binding.buttonBackReport.setOnClickListener { finish() }

    binding.buttonPickDate.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        when (intent) {
          "daily" -> {
            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
              if (monthOfYear.toString().length <= 1) {
                viewModel.dateSelected.value = "${year}-${monthOfYear + 1}-${dayOfMonth}"
                binding.textDate.text = viewModel.dateSelected.value

              } else if (dayOfMonth.toString().length <= 1) {
                viewModel.dateSelected.value = "${year}-0${monthOfYear + 1}-0${dayOfMonth}"
                binding.textDate.text = viewModel.dateSelected.value

              } else if (dayOfMonth.toString().length <= 1 && monthOfYear.toString().length <= 1) {
                viewModel.dateSelected.value = "${year}-0${monthOfYear + 1}-0${dayOfMonth}"
                binding.textDate.text = viewModel.dateSelected.value

              } else {
                viewModel.dateSelected.value = "${year}-${monthOfYear + 1}-${dayOfMonth}"
                binding.textDate.text = viewModel.dateSelected.value
              }
            }, year, month, day)
            datePickerDialog.show()

          }
          "monthly" -> {
            MonthPickerDialog.Builder(
              this,
              MonthPickerDialog.OnDateSetListener { selectedMonth, selectedYear ->
                generateMonty(selectedMonth + 1)
              }, year, month
            ).showMonthOnly()
              .build()
              .show()

          }
          "yearly" -> {
            MonthPickerDialog.Builder(
              this,
              MonthPickerDialog.OnDateSetListener { selectedMonth, selectedYear ->
                viewModel.yearSelected.value = selectedYear.toString()
                text_date.text = selectedYear.toString()
              }, year, month
            ).showYearOnly()
              .build()
              .show()
          }
        }
      }

  }

  private fun export(urlExport: String) {
    if (isReportEmpty) {
      Toast.makeText(this, "Tidak ada data yang bisa di Export.", Toast.LENGTH_SHORT).show()
    } else {
      val intentExport = Intent(Intent.ACTION_VIEW)
      intentExport.data = Uri.parse(urlExport)
      startActivity(intentExport)
    }

  }

  private fun setAdapter(response: ReportResponse) {
    isReportEmpty = response.creditPoint.isNullOrEmpty()

    adapterReportDaily = ReportDailyAdapter(this, response)

    if (response.creditPoint.isNullOrEmpty()) {
      binding.recyclerReportDaily.visibility = GONE
      binding.imageEmpty.visibility = VISIBLE
      binding.textEmptyCaption.visibility = VISIBLE
    } else {
      binding.recyclerReportDaily.visibility = VISIBLE
      binding.imageEmpty.visibility = GONE
      binding.textEmptyCaption.visibility = GONE

      binding.recyclerReportDaily.apply {
        layoutManager = LinearLayoutManager(this@ReportDailyActivity)
        adapter = adapterReportDaily
        adapterReportDaily.notifyDataSetChanged()
      }
    }
  }

  private fun generateMonty(month: Int) {
    when (month) {
      1 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Januari"
      }
      2 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Februari"
      }
      3 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Maret"
      }
      4 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "April"
      }
      5 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Mei"
      }
      6 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Juni"
      }
      7 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Juli"
      }
      8 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "Agustus"
      }
      9 -> {
        viewModel.monthSelected.value = "0$month"
        binding.textDate.text = "September"
      }
      10 -> {
        viewModel.monthSelected.value = "$month"
        binding.textDate.text = "Oktober"
      }
      11 -> {
        viewModel.monthSelected.value = "$month"
        binding.textDate.text = "November"
      }
      12 -> {
        viewModel.monthSelected.value = "$month"
        binding.textDate.text = "Desember"
      }
    }
  }
}