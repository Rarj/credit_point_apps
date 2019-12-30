package grack.dev.creditpointapp.features.loginwalimurid.history

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityHistoryBinding
import grack.dev.creditpointapp.preferences.SharedPref

class HistoryActivity : AppCompatActivity() {

  lateinit var viewModel: HistoryViewModel
  lateinit var binding: ActivityHistoryBinding
  lateinit var adapterPrestasi: HistoryAdapterPrestasi
  lateinit var adapterPelanggaran: HistoryAdapterPelanggaran

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(HistoryViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_history)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    binding.recyclerPenambahan.visibility = VISIBLE
    binding.recyclerPengurangan.visibility = GONE

    binding.chipPrestasi.setOnCheckedChangeListener { buttonView, isChecked ->
      if (isChecked) {
        binding.recyclerPenambahan.visibility = VISIBLE
        binding.recyclerPengurangan.visibility = GONE
      }
    }

    binding.buttonBack.setOnClickListener { finish() }

    binding.chipPelanggaran.setOnCheckedChangeListener { buttonView, isChecked ->
      if (isChecked) {
        binding.recyclerPenambahan.visibility = GONE
        binding.recyclerPengurangan.visibility = VISIBLE
      }
    }

    viewModel.loadHistory(SharedPref.getWaliMurid(this).idSiswa.toString())
      .subscribe {
        adapterPrestasi = HistoryAdapterPrestasi(viewModel.prestasiList.value!!)
        adapterPelanggaran = HistoryAdapterPelanggaran(viewModel.pelanggaranList.value!!)

        binding.recyclerPenambahan.apply {
          layoutManager = LinearLayoutManager(this@HistoryActivity)
          adapter = adapterPrestasi
          adapterPrestasi.notifyDataSetChanged()
        }

        binding.recyclerPengurangan.apply {
          layoutManager = LinearLayoutManager(this@HistoryActivity)
          adapter = adapterPelanggaran
          adapterPelanggaran.notifyDataSetChanged()
        }
      }

  }

  companion object {
    private const val TAG = "HistoryActivity"
  }
}
