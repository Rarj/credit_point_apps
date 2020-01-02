package grack.dev.creditpointapp.features.guru

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemListGuruBinding
import grack.dev.creditpointapp.repository.guru.model.Guru
import grack.dev.creditpointapp.repository.guru.model.GuruResponse

class GuruAdapter(private val listGuru: GuruResponse) : RecyclerView.Adapter<GuruAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemListGuruBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return listGuru.guru!!.size
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(listGuru.guru?.get(position))
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(guru: Guru?) {
      viewDataBinding.setVariable(BR.modelGuru, guru)
      viewDataBinding.executePendingBindings()
    }

  }


}