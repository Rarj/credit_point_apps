package grack.dev.creditpointapp.features.guru

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.ActivityGuruBinding

class GuruActivity : AppCompatActivity() {

  lateinit var viewModel: GuruViewModel
  lateinit var binding: ActivityGuruBinding
  lateinit var adapterGuru: GuruAdapter

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(GuruViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_guru)
    binding.lifecycleOwner = this

    viewModel.loadListGuru()
      .subscribe {
        adapterGuru = GuruAdapter(it)
        binding.recyclerDataGuru.apply {
          layoutManager = LinearLayoutManager(this@GuruActivity)
          adapter = adapterGuru
          adapterGuru.notifyDataSetChanged()
        }
      }

  }
}
