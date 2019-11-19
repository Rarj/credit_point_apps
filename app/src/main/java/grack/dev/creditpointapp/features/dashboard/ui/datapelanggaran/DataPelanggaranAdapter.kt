package grack.dev.creditpointapp.features.dashboard.ui.datapelanggaran

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemDataPelanggaranBinding
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.datapelanggaran.model.Point

class DataPelanggaranAdapter(
  val context: Context?,
  val list: DataPelanggaran
) : RecyclerView.Adapter<DataPelanggaranAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val layoutInflater = LayoutInflater.from(context)
    val view = ItemDataPelanggaranBinding.inflate(layoutInflater, parent, false)
    return ViewHolder(view)
  }

  override fun getItemCount() = list.point.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(list.point[position])
  }

  class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(point: Point?) {
      binding.executePendingBindings()
      binding.setVariable(BR.viewModel, point)
    }
  }
}