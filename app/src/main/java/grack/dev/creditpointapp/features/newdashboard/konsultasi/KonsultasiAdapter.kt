package grack.dev.creditpointapp.features.newdashboard.konsultasi

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemDataKonsultasiSiswaBinding
import grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse
import kotlinx.android.synthetic.main.item_data_konsultasi_siswa.view.*
import java.util.concurrent.TimeUnit

class KonsultasiAdapter(
  private val context: Context,
  private val konsultasiList: KonsultasiResponse
) : RecyclerView.Adapter<KonsultasiAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemDataKonsultasiSiswaBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount() = 0

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind("")
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
    @SuppressLint("CheckResult")
    fun bind(model: String) {
      viewDataBinding.setVariable(BR.model, model)
      viewDataBinding.executePendingBindings()

      viewDataBinding.root.container_konsultasi_siswa.clicks()
        .throttleFirst(500, TimeUnit.MILLISECONDS)
        .subscribe {

        }
    }
  }


}