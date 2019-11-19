package grack.dev.creditpointapp.features.dashboard.ui.kelas

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import grack.dev.creditpointapp.R

class KelasFragment : Fragment() {

  private lateinit var kelasViewModel: KelasViewModel

  @SuppressLint("CheckResult")
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    kelasViewModel =
      ViewModelProviders.of(this).get(KelasViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_kelas, container, false)

    kelasViewModel.listKelas()
      .subscribe {
        Log.e("ALSDJLSAJDS", "onCreateView: $it")
      }

    return root
  }
}
