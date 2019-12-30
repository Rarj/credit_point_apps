package grack.dev.creditpointapp.features.loginwalimurid.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemHistoryPelanggaranSiswaBinding
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran

class HistoryAdapterPelanggaran(val pelanggaran: List<Pelanggaran>) : RecyclerView.Adapter<HistoryAdapterPelanggaran.ViewHodler>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHodler {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemHistoryPelanggaranSiswaBinding.inflate(inflater, parent, false)
    return ViewHodler(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return pelanggaran.size
  }

  override fun onBindViewHolder(holder: ViewHodler, position: Int) {
    holder.bind(pelanggaran[position])
  }

  class ViewHodler(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(prestasi: Pelanggaran) {
      viewDataBinding.setVariable(BR.viewModelPelanggaran, prestasi)
      viewDataBinding.executePendingBindings()
    }
  }
}