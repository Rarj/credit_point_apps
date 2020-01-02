package grack.dev.creditpointapp.features.newdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.login.LoginActivity
import grack.dev.creditpointapp.preferences.SharedPref
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_profile)

    if (SharedPref.getUser(this).foto.isNullOrEmpty()) {
      Glide.with(this).load(R.drawable.ic_teacher_2).into(profile_image)
    } else {
      Glide.with(this).load(SharedPref.getUser(this).foto).into(profile_image)
    }
    text_status.text = SharedPref.getUser(this).statusAdmin
    text_nama.text = SharedPref.getUser(this).namaAdmin
    text_email.text = SharedPref.getUser(this).emailAdmin
    text_alamat.text = SharedPref.getUser(this).alamatAdmin

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
