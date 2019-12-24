package grack.dev.creditpointapp.features.dashboard.ui.datainformasi

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentDataInformasiBinding

class DataInformasiFragment : Fragment() {

  private lateinit var homeViewViewModel: DataInformasiViewModel
  private lateinit var binding: FragmentDataInformasiBinding
  private lateinit var adapterDataInformasi: DataInformasiAdapter

  @SuppressLint("CheckResult")
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    homeViewViewModel = ViewModelProviders.of(this).get(DataInformasiViewModel::class.java)
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_data_informasi, container, false)

    homeViewViewModel.listInformasi()
      .subscribe {

        if (it.information.isEmpty()) {
          binding.imageEmpty.visibility = VISIBLE
          binding.textEmptyCaption.visibility = VISIBLE
        } else {
          binding.imageEmpty.visibility = GONE
          binding.textEmptyCaption.visibility = GONE
        }

        binding.progressHorizontal.visibility = GONE

        adapterDataInformasi = DataInformasiAdapter(activity!!, it.information.toMutableList())

        binding.recyclerDataInformasi.apply {
          layoutManager = LinearLayoutManager(activity)
          adapter = adapterDataInformasi
          adapterDataInformasi.notifyDataSetChanged()
        }

      }

    return binding.root
  }
}
