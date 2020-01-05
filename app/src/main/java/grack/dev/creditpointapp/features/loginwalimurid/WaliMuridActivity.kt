package grack.dev.creditpointapp.features.loginwalimurid

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.dashboard.ui.datainformasi.DataInformasiFragment
import grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaActivity
import grack.dev.creditpointapp.features.guru.GuruActivity
import grack.dev.creditpointapp.features.login.LoginActivity
import grack.dev.creditpointapp.features.loginwalimurid.editprofile.EditProfileActivity
import grack.dev.creditpointapp.features.loginwalimurid.history.HistoryActivity
import grack.dev.creditpointapp.preferences.SharedPref
import kotlinx.android.synthetic.main.activity_wali_murid.*
import java.util.concurrent.TimeUnit

class WaliMuridActivity : AppCompatActivity() {

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_wali_murid)

    text_nama_wali_murid.text = SharedPref.getWaliMurid(this).namaAdmin
    text_level_user.text = SharedPref.getWaliMurid(this).statusAdmin

    container_info.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        startActivity(Intent(this, DataInformasiFragment::class.java))
      }

    container_profile.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val intent = Intent(this, DetailSiswaActivity::class.java)
        intent.putExtra("key_id_siswa", SharedPref.getWaliMurid(this).idSiswa)
        intent.putExtra("wali_murid", "wali_murid")
        intent.putExtra("sisa_point_siswa", SharedPref.getWaliMurid(this).sisaPointSiswa)
        startActivity(intent)
      }

    container_pelanggaran_siswa.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val intent = Intent(this, HistoryActivity::class.java)
        intent.putExtra("key_id_siswa", SharedPref.getWaliMurid(this).idSiswa)
        startActivity(intent)
      }

    button_logout.setOnClickListener {
      SharedPref.removeUser(this)
      SharedPref.removeUserLoggedIn(this)
      SharedPref.removeUserLoggedInWaliMurid(this)
      startActivity(Intent(this, LoginActivity::class.java))
      finishAffinity()
    }

    container_list_guru.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val intent = Intent(this, GuruActivity::class.java)
        startActivity(intent)
      }

    button_edit_profile.clicks()
      .throttleFirst(500, TimeUnit.MILLISECONDS)
      .subscribe {
        val intent = Intent(this, EditProfileActivity::class.java)
        startActivityForResult(intent, 200)
      }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    val isSuccess = data?.getStringExtra("status")

    if (requestCode == 200 && resultCode == Activity.RESULT_OK) {
      if (isSuccess == "success") {
        text_nama_wali_murid.text = SharedPref.getWaliMurid(this).namaAdmin
        text_level_user.text = SharedPref.getWaliMurid(this).statusAdmin
      }
    }

  }

}
