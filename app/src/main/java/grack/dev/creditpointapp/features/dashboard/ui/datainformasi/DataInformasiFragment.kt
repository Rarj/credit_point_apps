package grack.dev.creditpointapp.features.dashboard.ui.datainformasi

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentDataInformasiBinding

class DataInformasiFragment : AppCompatActivity() {

  private lateinit var homeViewViewModel: DataInformasiViewModel
  private lateinit var binding: FragmentDataInformasiBinding
  private lateinit var adapterDataInformasi: DataInformasiAdapter

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    homeViewViewModel = ViewModelProviders.of(this).get(DataInformasiViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.fragment_data_informasi)

    binding.buttonBack.setOnClickListener { finish() }

    homeViewViewModel.listInformasi()
      .subscribe({ dataInformasi ->
        if (dataInformasi.information.isEmpty()) {
          binding.imageEmpty.visibility = VISIBLE
          binding.textEmptyCaption.visibility = VISIBLE
        } else {
          binding.imageEmpty.visibility = GONE
          binding.textEmptyCaption.visibility = GONE
        }

        binding.progressHorizontal.visibility = GONE

        adapterDataInformasi = DataInformasiAdapter(this, dataInformasi.information.toMutableList())

        binding.recyclerDataInformasi.apply {
          layoutManager = LinearLayoutManager(this@DataInformasiFragment)
          adapter = adapterDataInformasi
          adapterDataInformasi.notifyDataSetChanged()
        }
      }, {
        Log.e("AKSDHAJKSHAS", it.toString())
        Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
      })
  }
}
