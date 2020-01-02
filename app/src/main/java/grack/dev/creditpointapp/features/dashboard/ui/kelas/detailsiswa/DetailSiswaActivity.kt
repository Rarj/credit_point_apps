package grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityDetailSiswaBinding
import grack.dev.creditpointapp.features.dashboard.ui.inputpoint.InputPointActivity
import java.util.concurrent.TimeUnit

class DetailSiswaActivity : AppCompatActivity() {

  lateinit var viewModel: DetailSiswaViewModel
  lateinit var binding: ActivityDetailSiswaBinding

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(DetailSiswaViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_siswa)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    val intentKeyId = intent.getStringExtra("key_id_siswa")
    val intentFlag = intent.getStringExtra("wali_murid")
    val intentSisaPointSiswa = intent.getStringExtra("sisa_point_siswa")

    if (intentFlag == "wali_murid") {
      binding.buttonInput.visibility = GONE
      binding.textTitle.text = "Detail Siswa \nSisa Point adalah $intentSisaPointSiswa"
    } else {
      binding.buttonInput.visibility = VISIBLE
    }

    setDetailSiswa(intentKeyId)

    binding.buttonBack.clicks().throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        finish()
      }

    binding.buttonInput.setOnClickListener {
      val intents = Intent(this, InputPointActivity::class.java)
      intents.putExtra("idSiswa", intentKeyId)
      intents.putExtra("namaSiswa", viewModel.detailSiswa.value?.nama)
      startActivityForResult(intents, 200)
    }

  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    val listenerCode = data?.getStringExtra("listenerCode")

    if (requestCode == 200 && resultCode == Activity.RESULT_OK) {
      if (listenerCode == "listenerCode") {
        val intent = Intent()
        intent.putExtra("listenerCode", "listenerCode")
        setResult(Activity.RESULT_OK, intent)
        finish()
      } else {
        Toast.makeText(this, "listener tidak cocok", Toast.LENGTH_SHORT).show()
      }
    }
  }

  @SuppressLint("CheckResult")
  private fun setDetailSiswa(idSiswa: String?) {
    viewModel.loadDetailSiswa(idSiswa)
      .doFinally {
        binding.progressHorizontal.visibility = GONE
        binding.containerScroll.visibility = VISIBLE
      }
      .subscribe({
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
      }, {
        Log.e("AKSDHAJKSHAS", it.toString())
        Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
      })
  }

}
