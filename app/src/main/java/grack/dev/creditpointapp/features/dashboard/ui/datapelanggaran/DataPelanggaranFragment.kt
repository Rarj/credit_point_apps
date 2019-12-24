package grack.dev.creditpointapp.features.dashboard.ui.datapelanggaran

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentDataPelanggaranBinding

class DataPelanggaranFragment : AppCompatActivity() {

  private lateinit var dataPelanggaranViewModel: DataPelanggaranViewModel
  private lateinit var binding: FragmentDataPelanggaranBinding
  private lateinit var dataPelanggaranAdapter: DataPelanggaranAdapter

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    dataPelanggaranViewModel = ViewModelProviders.of(this).get(DataPelanggaranViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.fragment_data_pelanggaran)
    binding.viewModel = dataPelanggaranViewModel
    binding.lifecycleOwner = this

    binding.buttonBackPelanggaran.setOnClickListener { finish() }

    dataPelanggaranViewModel.listDataPelanggaran()
      .subscribe({ dataPelanggaran ->
        binding.progressHorizontal.visibility = GONE

        if (dataPelanggaran != null) {
          dataPelanggaranAdapter = DataPelanggaranAdapter(this, dataPelanggaranViewModel.dataPelanggaran.value!!)
          binding.recyclerDataPelanggaran.apply {
            layoutManager = LinearLayoutManager(this@DataPelanggaranFragment)
            adapter = dataPelanggaranAdapter
            dataPelanggaranAdapter.notifyDataSetChanged()
          }

        } else {
          binding.imageEmpty.visibility = VISIBLE
          binding.textEmptyCaption.visibility = VISIBLE
        }

      }, {
        Log.e(DataPelanggaranFragment::class.java.name, it.toString())
      })

  }
}
