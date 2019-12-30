package grack.dev.creditpointapp.features.newdashboard.konsultasi

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityKonsultasiBinding

class KonsultasiActivity : AppCompatActivity() {

  private lateinit var viewModel: KonsultasiViewModel
  private lateinit var binding: ActivityKonsultasiBinding
  private lateinit var adapterKonsultasi: KonsultasiAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(KonsultasiViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_konsultasi)
    binding.lifecycleOwner = this
    binding.viewModelKonsultasi = viewModel

    viewModel.loadAllSiswa()

    viewModel.listSemuaSiswa.observe(this, Observer { konsultasiResponse ->
      if (konsultasiResponse.pelanggaran.isNotEmpty()) {
        binding.progressHorizontal.visibility = GONE
        binding.recyclerDataKonsultasiSiswa.visibility = VISIBLE

        adapterKonsultasi = KonsultasiAdapter(this, konsultasiResponse)
        binding.recyclerDataKonsultasiSiswa.apply {
          layoutManager = LinearLayoutManager(this@KonsultasiActivity)
          adapter = adapterKonsultasi
          adapterKonsultasi.notifyDataSetChanged()
        }
      }
    })

    binding.buttonBack.setOnClickListener { finish() }

  }
}
