package grack.dev.creditpointapp.features.dashboard

import android.os.Bundle
import android.view.Menu
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import grack.dev.creditpointapp.R
import kotlinx.android.synthetic.main.app_bar_dashboard.*

class DashboardActivity : AppCompatActivity() {

  private lateinit var appBarConfiguration: AppBarConfiguration
  private lateinit var appBarConfigurationBk: AppBarConfiguration

  private var privilege: String? = null

  private lateinit var drawerLayout: DrawerLayout
  private lateinit var navView: NavigationView
  private lateinit var navController: NavController

  private lateinit var drawerLayoutBk: DrawerLayout
  private lateinit var navViewBk: NavigationView
  private lateinit var navControllerBk: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    privilege = intent.getStringExtra("privilege")

    if (privilege == "Guru") {
      setContentView(R.layout.activity_dashboard)
      drawerLayout = findViewById(R.id.drawer_layout)
      navView = findViewById(R.id.nav_view)
      navController = findNavController(R.id.nav_host_fragment)

    } else if (privilege == "Guru BK") {
      setContentView(R.layout.activity_dashboard_bk)
      drawerLayoutBk = findViewById(R.id.drawer_layout_bk)
      navViewBk = findViewById(R.id.nav_view_bk)
      navControllerBk = findNavController(R.id.nav_host_fragment_bk)
    }

    val toolbar: Toolbar = findViewById(R.id.toolbar)
    setSupportActionBar(toolbar)

    val fab: FloatingActionButton = findViewById(R.id.fab)
    fab.setOnClickListener { view ->
      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show()
    }

    if (privilege == "Guru") {
      navView.visibility = VISIBLE

      content_dashboard.visibility = VISIBLE
      content_dashboard_bk.visibility = GONE

      appBarConfiguration = AppBarConfiguration(
        setOf(
          R.id.nav_home, R.id.nav_gallery, R.id.nav_data_pelanggaran, R.id.nav_ranking_siswa
        ), drawerLayout
      )
      setupActionBarWithNavController(navController, appBarConfiguration)
      navView.setupWithNavController(navController)

    } else if (privilege == "Guru BK") {
      navViewBk.visibility = VISIBLE

      content_dashboard.visibility = GONE
      content_dashboard_bk.visibility = VISIBLE

      appBarConfigurationBk = AppBarConfiguration(
        setOf(
          R.id.nav_report_bk, R.id.nav_ruang_konsultasi_bk, R.id.nav_informasi_bk, R.id.nav_kelas_bk, R.id.nav_ranking_bk
        ), drawerLayoutBk
      )
      setupActionBarWithNavController(navControllerBk, appBarConfigurationBk)
      navViewBk.setupWithNavController(navControllerBk)
    }

  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.dashboard, menu)
    return true
  }

  override fun onSupportNavigateUp(): Boolean {
    if (privilege == "Guru") {
      val navController = findNavController(R.id.nav_host_fragment)
      return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

    } else if (privilege == "Guru BK") {
      val navControllerBk = findNavController(R.id.nav_host_fragment_bk)
      return navControllerBk.navigateUp(appBarConfigurationBk) || super.onSupportNavigateUp()
    }

    return false
  }
}
