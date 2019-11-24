package grack.dev.creditpointapp.features.dashboard.ui.inputsiswa

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityInputPointBinding
import java.util.concurrent.TimeUnit

class InputPointActivity : AppCompatActivity() {

  lateinit var viewModel: InputPointViewModel
  lateinit var binding: ActivityInputPointBinding

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(InputPointViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_input_point)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    val intent = intent.getStringExtra("key_id_siswa")
    setDetailSiswa(intent)

    binding.buttonBack.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        finish()
      }

  }

  @SuppressLint("CheckResult")
  private fun setDetailSiswa(idSiswa: String?) {
    viewModel.loadDetailSiswa(idSiswa)
      .subscribe {
        it.siswa?.forEach { siswa ->
          viewModel.detailSiswa.value = DetailSiswaModel(
            siswa?.alamat,
            siswa?.alamatAyah,
            siswa?.alamatIbu,
            siswa?.alamatWali,
            siswa?.anakKe,
            siswa?.createdBy,
            siswa?.createdDate,
            siswa?.deletedBy,
            siswa?.deletedDate,
            siswa?.idKelas,
            siswa?.idSiswa,
            siswa?.isDeleted,
            siswa?.jenisKelamin,
            siswa?.jumlahSaudara,
            siswa?.nama,
            siswa?.namaAyah,
            siswa?.namaIbu,
            siswa?.namaWali,
            siswa?.noTelp,
            siswa?.noTelpAyah,
            siswa?.noTelpIbu,
            siswa?.noTelpWali,
            siswa?.pekerjaanAyah,
            siswa?.pekerjaanIbu,
            siswa?.pekerjaanWali,
            siswa?.penghasilanAyah,
            siswa?.penghasilanIbu,
            siswa?.penghasilanWali,
            siswa?.tempatLahir,
            siswa?.tglLahir,
            siswa?.updatedBy,
            siswa?.updatedDate
          )
        }
      }
  }

}
