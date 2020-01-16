package grack.dev.creditpointapp.features.dashboard.ui.jenispelanggaran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentJenisPelanggaranBinding

class JenisPelanggaranFragment(private val listener: ItemClickListener) : BottomSheetDialogFragment() {

  private lateinit var binding: FragmentJenisPelanggaranBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_jenis_pelanggaran, container, false)

    binding.buttonBack.setOnClickListener { dismiss() }

    binding.textPenambahan.setOnClickListener {
      listener.onItemClicked(binding.textPenambahan.text.toString())
      dismiss()
    }

    binding.textPengurangan.setOnClickListener {
      listener.onItemClicked(binding.textPengurangan.text.toString())
      dismiss()
    }

    return binding.root
  }

}

interface ItemClickListener {
  fun onItemClicked(jenisPoin: String)
}
