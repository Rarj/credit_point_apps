package grack.dev.creditpointapp.features.loginwalimurid.editprofile

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding3.widget.afterTextChangeEvents
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.preferences.SharedPref
import grack.dev.creditpointapp.preferences.UpdateWaliMuridPreferences
import grack.dev.creditpointapp.repository.loginwalimurid.LoginWaliMuridRepository
import grack.dev.creditpointapp.repository.loginwalimurid.editwalimurid.UpdateProfileWaliMuridResponse
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfileActivity : AppCompatActivity() {

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_edit_profile)

    edit_nama.setText(SharedPref.getWaliMurid(this).namaAdmin)
    edit_alamat.setText(SharedPref.getWaliMurid(this).alamatAdmin)
    edit_jenis_kelamin.setText(SharedPref.getWaliMurid(this).jenisKelaminWaliMurid)
    edit_email.setText(SharedPref.getWaliMurid(this).emailAdmin)

    val COUNTRIES = arrayOf("Laki-Laki", "Perempuan")
    val adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES)
    edit_jenis_kelamin.setAdapter(adapter)

    button_close.setOnClickListener { finish() }

    edit_password.afterTextChangeEvents()
      .skipInitialValue()
      .subscribe {
        button_update_profile.isEnabled = it.editable.toString() == SharedPref.getWaliMurid(this).passwordWaliMurid
      }

    button_update_profile.setOnClickListener {
      button_update_profile.isEnabled = false

      val request = UpdateWaliMuridPreferences(
        SharedPref.getWaliMurid(this).idWaliMurid,
        edit_nama.text.toString(),
        edit_alamat.text.toString(),
        edit_jenis_kelamin.text.toString(),
        edit_email.text.toString(),
        edit_password.text.toString()
      )

      updateProfile(request)
        .subscribe { response ->
          if (response.status == "success") {
            SharedPref.updateWaliMurid(request, this)

            val intent = Intent()
            intent.putExtra("status", response.status)
            setResult(Activity.RESULT_OK, intent)
            finish()
          } else {
            Toast.makeText(this, "Error Update Profile. Silahkan Ulangi lagi ya", Toast.LENGTH_SHORT).show()
            button_update_profile.isEnabled = true
          }
        }
    }
  }

  private fun updateProfile(request: UpdateWaliMuridPreferences): Observable<UpdateProfileWaliMuridResponse> {
    return LoginWaliMuridRepository.updateProvileWaliMurid(request)
      .map {
        it
      }
  }

}
