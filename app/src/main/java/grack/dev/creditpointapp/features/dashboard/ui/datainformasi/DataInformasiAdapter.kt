package grack.dev.creditpointapp.features.dashboard.ui.datainformasi

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemDataInformasiBinding
import grack.dev.creditpointapp.repository.datainformasi.model.Information

class DataInformasiAdapter(
  val context: Context,
  val list: MutableList<Information?>
) : RecyclerView.Adapter<DataInformasiAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(context)
    val view = ItemDataInformasiBinding.inflate(inflater, parent, false)
    return ViewHolder(view)
  }

  override fun getItemCount() = list.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(list[position])
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(model: Information?) {
      viewDataBinding.setVariable(BR.viewModel, model)
      viewDataBinding.executePendingBindings()
    }

  }
}