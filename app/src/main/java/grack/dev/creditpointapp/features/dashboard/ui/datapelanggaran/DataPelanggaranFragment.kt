package grack.dev.creditpointapp.features.dashboard.ui.datapelanggaran

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentDataPelanggaranBinding

class DataPelanggaranFragment : Fragment() {

  private lateinit var dataPelanggaranViewModel: DataPelanggaranViewModel
  private lateinit var binding: FragmentDataPelanggaranBinding
  private lateinit var dataPelanggaranAdapter: DataPelanggaranAdapter

  @SuppressLint("CheckResult")
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    dataPelanggaranViewModel = ViewModelProviders.of(this).get(DataPelanggaranViewModel::class.java)
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_data_pelanggaran, container, false)
    binding.viewModel = dataPelanggaranViewModel
    binding.lifecycleOwner = this

    dataPelanggaranViewModel.listDataPelanggaran()
      .subscribe {
        binding.progressHorizontal.visibility = GONE
        dataPelanggaranAdapter = DataPelanggaranAdapter(activity, dataPelanggaranViewModel.dataPelanggaran.value!!)
        binding.recyclerDataPelanggaran.apply {
          layoutManager = LinearLayoutManager(activity)
          adapter = dataPelanggaranAdapter
          dataPelanggaranAdapter.notifyDataSetChanged()
        }
      }


    return binding.root
  }
}
