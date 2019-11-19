package grack.dev.creditpointapp.features.dashboard.ui.kelas

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentKelasBinding

class KelasFragment : Fragment(), AdapterView.OnItemSelectedListener {

  private lateinit var kelasViewModel: KelasViewModel
  private lateinit var binding: FragmentKelasBinding

  @SuppressLint("CheckResult")
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    kelasViewModel = ViewModelProviders.of(this).get(KelasViewModel::class.java)
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kelas, container, false)

    binding.spinnerKelas.onItemSelectedListener = this

    kelasViewModel.listKelas()
      .subscribe {
        val kelasList = ArrayList<String>()

        it.kelas?.forEach { kelas ->
          kelasList.add(kelas?.kelas.toString())
        }

        val arrayAdapter = ArrayAdapter<String>(activity!!, android.R.layout.simple_spinner_item, kelasList)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerKelas.adapter = arrayAdapter
      }

    return binding.root
  }

  override fun onNothingSelected(parent: AdapterView<*>?) {
  }

  @SuppressLint("CheckResult")
  override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    kelasViewModel.listKategoriKelas(binding.spinnerKelas.selectedItem.toString())
      .subscribe {
        val kategoriKelasList = ArrayList<String>()

        it.kategoriKelas?.forEach { kategoriKelas ->
          kategoriKelasList.add(kategoriKelas?.namaKelas.toString())
        }

        val arrayAdapter = ArrayAdapter<String>(activity!!, android.R.layout.simple_spinner_item, kategoriKelasList)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerKategoriKelas.adapter = arrayAdapter
      }
  }
}
