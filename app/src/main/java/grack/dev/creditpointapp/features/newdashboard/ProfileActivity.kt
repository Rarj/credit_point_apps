package grack.dev.creditpointapp.features.newdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.login.LoginActivity
import grack.dev.creditpointapp.preferences.SharedPref
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_profile)

    text_profile.text =
      "Selamat datang, ${SharedPref.getUser(this).namaAdmin}! " +
            "\nEmail : ${SharedPref.getUser(this).emailAdmin} " +
            "\nAlamat : ${SharedPref.getUser(this).alamatAdmin} " +
            "\nStatus : ${SharedPref.getUser(this).statusAdmin}"

    button_back.setOnClickListener { finish() }

    button_logout.setOnClickListener {
      SharedPref.removeUser(this)
      SharedPref.removeUserLoggedIn(this)
      SharedPref.removeUserLoggedInWaliMurid(this)
      startActivity(Intent(this, LoginActivity::class.java))
      finishAffinity()
    }

  }
}
