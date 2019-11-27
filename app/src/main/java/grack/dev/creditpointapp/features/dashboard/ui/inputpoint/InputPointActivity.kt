package grack.dev.creditpointapp.features.dashboard.ui.inputpoint

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityInputPointBinding
import grack.dev.creditpointapp.preferences.SharedPref
import grack.dev.creditpointapp.repository.datapelanggaran.model.Point
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import java.util.concurrent.TimeUnit

class InputPointActivity : AppCompatActivity() {

  lateinit var viewModel: InputPointViewModel
  lateinit var binding: ActivityInputPointBinding

  private lateinit var idPoint: String

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(InputPointViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_input_point)

    val intentIdSiswa = intent.getStringExtra("idSiswa")
    val intentNamaSiswa = intent.getStringExtra("namaSiswa")

    binding.textSubtitle.text = intentNamaSiswa
    binding.textTitle.text = "Input Point"

    viewModel.loadPoint()
      .subscribe {
        val pointList = ArrayList<Point>()
        pointList.add(Point())

        it.point.forEach { point ->
          pointList.add(point)
        }

        val arrayAdapter = ArrayAdapter<Point>(this, android.R.layout.simple_spinner_item, pointList)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerInput.adapter = arrayAdapter

        binding.spinnerInput.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
          override fun onNothingSelected(parent: AdapterView<*>?) {
            binding.spinnerInput.setSelection(0)
          }

          override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            idPoint = arrayAdapter.getItem(position)?.idPoint ?: ""
          }
        }
      }

    binding.buttonSave.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val request = InputPointRequest(intentIdSiswa.toString(), idPoint, SharedPref.getUser(this).namaAdmin.toString())
        viewModel.inputPoint(request)
          .subscribe {
            if (it.status == "Data Berhasil Masuk") {
              val intent = Intent()
              intent.putExtra("listenerCode", "listenerCode")
              setResult(Activity.RESULT_OK, intent)
              finish()
            }
          }
      }

  }
}
