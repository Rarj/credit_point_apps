package grack.dev.creditpointapp.features.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.features.dashboard.DashboardActivity
import grack.dev.creditpointapp.features.login.LoginActivity
import grack.dev.creditpointapp.preferences.SharedPref

class SplashScreenActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash_screen)

    if (SharedPref.getUserLoggedIn(this)!!) {
      startActivity(Intent(this, DashboardActivity::class.java))
      finish()
    } else {
      startActivity(Intent(this, LoginActivity::class.java))
      finish()
    }

  }
}
