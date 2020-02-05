package grack.dev.creditpointapp.features.dashboard.ui.datainformasi.detail

import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.repository.datainformasi.model.Information
import kotlinx.android.synthetic.main.activity_detail_informasi.*

class DetailInformasiActivity : AppCompatActivity() {

  lateinit var model: Information
  var data: String? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail_informasi)

    data = intent.getStringExtra("data")

    val gson = Gson().fromJson<Information>(data, Information::class.java)

    text_title_informasi.text = gson.judulInformation.toString()
    text_created_by.text = "created by : ${gson.createdBy.toString()}"

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
      text_content.text = Html.fromHtml(gson.content.toString(), Html.FROM_HTML_MODE_COMPACT)
    } else {
      text_content.text = Html.fromHtml(gson.content.toString())
    }
  }
}
