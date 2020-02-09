package grack.dev.creditpointapp.features.guru

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemListGuruBinding
import grack.dev.creditpointapp.repository.guru.model.Guru
import grack.dev.creditpointapp.repository.guru.model.GuruResponse
import kotlinx.android.synthetic.main.item_list_guru.view.*

class GuruAdapter(
  private val listGuru: GuruResponse,
  private val context: Context
) : RecyclerView.Adapter<GuruAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemListGuruBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return listGuru.guru!!.size
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(listGuru.guru?.get(position), context)
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(guru: Guru?, context: Context) {
      viewDataBinding.setVariable(BR.modelGuru, guru)
      viewDataBinding.executePendingBindings()

      Glide.with(context).load(guru?.foto).into(viewDataBinding.root.image_guru)
    }

  }


}