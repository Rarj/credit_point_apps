package grack.dev.creditpointapp.features.dashboard.ui.rangking

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import grack.dev.creditpointapp.R
import grack.dev.creditpointapp.databinding.FragmentRangkingSiswaBinding

class RangkingSiswaFragment : AppCompatActivity() {

  lateinit var viewModel: RangkingSiswaViewModel
  lateinit var binding: FragmentRangkingSiswaBinding
  lateinit var rangkingSiswaAdapter: RangkingSiswaAdapter

  @SuppressLint("CheckResult")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProviders.of(this).get(RangkingSiswaViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.fragment_rangking_siswa)

    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    binding.buttonBack.setOnClickListener { finish() }

    viewModel.loadRangkingSiswa()
      .subscribe({
        binding.progressHorizontal.visibility = GONE

        rangkingSiswaAdapter = RangkingSiswaAdapter(it)

        binding.recyclerRangkingSiswa.apply {
          layoutManager = LinearLayoutManager(this@RangkingSiswaFragment)
          adapter = rangkingSiswaAdapter
          rangkingSiswaAdapter.notifyDataSetChanged()
        }
      }, {
        Log.e("AKSDHAJKSHAS", it.toString())
        Toast.makeText(this, "Terjadi kesalahan. Silahkan coba lagi, yaa.", Toast.LENGTH_SHORT).show()
      })

  }

}
