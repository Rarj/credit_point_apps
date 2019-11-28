package grack.dev.creditpointapp.features.dashboard.ui.rangking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemRangkingSiswaBinding
import grack.dev.creditpointapp.repository.rangking.model.CreditPoint
import grack.dev.creditpointapp.repository.rangking.model.RangkingResponse

class RangkingSiswaAdapter(val list: RangkingResponse?) : RecyclerView.Adapter<RangkingSiswaAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemRangkingSiswaBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount() = list?.creditPoint!!.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(list?.creditPoint?.get(position))
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(creditPoint: CreditPoint?) {
      viewDataBinding.setVariable(BR.model, creditPoint)
      viewDataBinding.executePendingBindings()
    }
  }

}