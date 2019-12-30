package grack.dev.creditpointapp.features.loginwalimurid.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemHistoryPrestasiSiswaBinding

import grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi

class HistoryAdapterPrestasi(val prestasi: List<Prestasi>) : RecyclerView.Adapter<HistoryAdapterPrestasi.ViewHodler>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHodler {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemHistoryPrestasiSiswaBinding.inflate(inflater, parent, false)
    return ViewHodler(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return prestasi.size
  }

  override fun onBindViewHolder(holder: ViewHodler, position: Int) {
    holder.bind(prestasi[position])
  }

  class ViewHodler(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(prestasi: Prestasi) {
      viewDataBinding.setVariable(BR.viewModelPrestasi, prestasi)
      viewDataBinding.executePendingBindings()
    }
  }
}