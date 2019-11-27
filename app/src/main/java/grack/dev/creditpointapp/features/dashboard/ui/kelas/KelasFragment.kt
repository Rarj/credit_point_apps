package grack.dev.creditpointapp.features.dashboard.ui.kelas

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentKelasBinding
import grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaActivity
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelas
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse
import grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse
import grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.Siswa

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
      .subscribe { response ->
        setKategoriKelas(response)
      }
  }

  private fun setKategoriKelas(kategoriKelasResponse: KategoriKelasResponse) {
    val kategoriKelasList = ArrayList<KategoriKelas>()
    kategoriKelasList.add(KategoriKelas())

    kategoriKelasResponse.kategoriKelas?.forEach { kategoriKelas ->
      kategoriKelasList.add(kategoriKelas)
    }

    val arrayAdapter = ArrayAdapter<KategoriKelas>(activity!!, android.R.layout.simple_spinner_item, kategoriKelasList)
    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    binding.spinnerKategoriKelas.adapter = arrayAdapter

    binding.spinnerKategoriKelas.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
      override fun onNothingSelected(parent: AdapterView<*>?) {

      }

      @SuppressLint("CheckResult")
      override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selectedText = arrayAdapter.getItem(position)

        if (selectedText?.namaKelas != "") {
          kelasViewModel.listSiswa(selectedText?.idKelas)
            .subscribe { dataKelasResponse ->
              setSiswa(dataKelasResponse)
            }
        }
      }
    }
  }

  private fun setSiswa(dataSiswaResponse: DataSiswaResponse) {
    val dataKelasList = ArrayList<Siswa>()
    dataKelasList.add(Siswa())

    dataSiswaResponse.siswa?.forEach { siswa ->
      dataKelasList.add(siswa)
    }

    val arrayAdapter = ArrayAdapter<Siswa>(activity!!, android.R.layout.simple_spinner_item, dataKelasList)
    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    binding.spinnerSiswa.adapter = arrayAdapter

    binding.spinnerSiswa.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
      override fun onNothingSelected(parent: AdapterView<*>?) {

      }

      @SuppressLint("CheckResult")
      override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val siswa = arrayAdapter.getItem(position)

        if (siswa?.nama != "") {
          val intent = Intent(activity, DetailSiswaActivity::class.java)
          intent.putExtra("key_id_siswa", siswa?.idSiswa)
          startActivityForResult(intent, 222)
        }
      }
    }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    val listenerCode = data?.getStringExtra("listenerCode")

    if (requestCode == 222 && resultCode == Activity.RESULT_OK) {
      if (listenerCode == "listenerCode") {
        binding.spinnerSiswa.setSelection(0)
      } else {
        Toast.makeText(activity, "listener tidak cocok", Toast.LENGTH_SHORT).show()
      }
    }

  }

}
