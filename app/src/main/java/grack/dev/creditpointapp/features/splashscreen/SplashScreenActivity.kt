package grack.dev.creditpointapp.features.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.login.LoginActivity
import grack.dev.creditpointapp.features.loginwalimurid.WaliMuridActivity
import grack.dev.creditpointapp.features.newdashboard.MainActivity
import grack.dev.creditpointapp.preferences.SharedPref

class SplashScreenActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash_screen)

    when {
      SharedPref.getUserLoggedIn(this)!! -> {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("privilege", SharedPref.getUser(this).statusAdmin)
        startActivity(intent)
        finish()
      }
      SharedPref.getUserLoggedInWaliMurid(this)!! -> {
        val intent = Intent(this, WaliMuridActivity::class.java)
        startActivity(intent)
        finish()
      }
      else -> {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
      }
    }

  }
}
