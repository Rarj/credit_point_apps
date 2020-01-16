package grack.dev.creditpointapp.features.dashboard.ui.inputpoint

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityInputPointBinding
import grack.dev.creditpointapp.features.dashboard.ui.jenispelanggaran.ItemClickListener
import grack.dev.creditpointapp.features.dashboard.ui.jenispelanggaran.JenisPelanggaranFragment
import grack.dev.creditpointapp.preferences.SharedPref
import grack.dev.creditpointapp.repository.datapelanggaran.model.Point
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import java.util.concurrent.TimeUnit

class InputPointActivity : AppCompatActivity() {

  lateinit var viewModel: InputPointViewModel
  lateinit var binding: ActivityInputPointBinding

  private lateinit var idPoint: String

  val pointList = ArrayList<Point>()

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(InputPointViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_input_point)

    val intentIdSiswa = intent.getStringExtra("idSiswa")
    val intentNamaSiswa = intent.getStringExtra("namaSiswa")

    binding.textSubtitle.text = intentNamaSiswa
    binding.textTitle.text = "Input Point"

    binding.buttonBack.setOnClickListener {
      finish()
    }

    binding.spinnerInputList.setOnClickListener {
      val bottomSheetFragment = JenisPelanggaranFragment(object : ItemClickListener {
        override fun onItemClicked(jenisPoin: String) {
          binding.spinnerInputList.text = jenisPoin
          if (jenisPoin.isNotBlank()) {
            binding.spinnerInput.visibility = VISIBLE
            binding.textCaptionInputPoint.visibility = VISIBLE

            load(jenisPoin)
          } else {
            binding.spinnerInput.visibility = GONE
            binding.textCaptionInputPoint.visibility = GONE
          }
        }
      })
      bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
    }

    binding.buttonSave.isEnabled = false

    binding.buttonSave.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val request = InputPointRequest(intentIdSiswa.toString(), idPoint, SharedPref.getUser(this).namaAdmin.toString())
        viewModel.inputPoint(request)
          .subscribe({
            if (it.status == "Data Berhasil Masuk") {
              Toast.makeText(this, "Input Point Berhasil Masuk", Toast.LENGTH_SHORT).show()
              val intent = Intent()
              intent.putExtra("listenerCode", "listenerCode")
              setResult(Activity.RESULT_OK, intent)
              finish()
            }
          }, {
            Log.e("AKSDHAJKSHAS", it.toString())
            Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
          })
      }
  }

  @SuppressLint("CheckResult")
  private fun load(jenispoint: String) {
    viewModel.loadPoint()
      .subscribe {
        pointList.add(Point())

        it.point.forEach { point ->
          pointList.add(point)
        }

        val filter = it.point.filter { data ->
          data.kategori == jenispoint
        }

        val arrayAdapter = ArrayAdapter<Point>(this, android.R.layout.simple_spinner_item, filter)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerInput.adapter = arrayAdapter

        binding.spinnerInput.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
          override fun onNothingSelected(parent: AdapterView<*>?) {
            binding.spinnerInput.setSelection(0)
          }

          override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            idPoint = arrayAdapter.getItem(position)?.idPoint ?: ""

            binding.buttonSave.isEnabled = idPoint != ""
          }
        }
      }
  }

}
