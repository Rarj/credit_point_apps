package grack.dev.creditpointapp.features.dashboard.ui.rangking

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentRangkingSiswaBinding

class RangkingSiswaFragment : Fragment() {

  lateinit var viewModel: RangkingSiswaViewModel
  lateinit var binding: FragmentRangkingSiswaBinding
  lateinit var rangkingSiswaAdapter: RangkingSiswaAdapter

  @SuppressLint("CheckResult")
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    viewModel = ViewModelProviders.of(this).get(RangkingSiswaViewModel::class.java)
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rangking_siswa, container, false)

    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    viewModel.loadRangkingSiswa()
      .subscribe {
        rangkingSiswaAdapter = RangkingSiswaAdapter(it)

        binding.recyclerRangkingSiswa.apply {
          layoutManager = LinearLayoutManager(activity)
          adapter = rangkingSiswaAdapter
          rangkingSiswaAdapter.notifyDataSetChanged()
        }

      }
    return binding.root
  }

}
