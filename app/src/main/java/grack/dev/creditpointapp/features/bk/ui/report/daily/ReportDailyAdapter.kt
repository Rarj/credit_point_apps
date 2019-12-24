package grack.dev.creditpointapp.features.bk.ui.report.daily

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemReportBinding
import grack.dev.creditpointapp.repository.report.model.CreditPoint
import grack.dev.creditpointapp.repository.report.model.ReportResponse
import kotlinx.android.synthetic.main.item_report.view.*
import java.util.concurrent.TimeUnit

class ReportDailyAdapter(
  val context: Context,
  val list: ReportResponse
) : RecyclerView.Adapter<ReportDailyAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemReportBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount() = list.creditPoint!!.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(list.creditPoint?.get(position), context)
  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    @SuppressLint("CheckResult")
    fun bind(model: CreditPoint?, context: Context) {
      viewDataBinding.setVariable(BR.model, model)
      viewDataBinding.executePendingBindings()

      viewDataBinding.root.button_attachment.clicks()
        .throttleFirst(500, TimeUnit.MILLISECONDS)
        .subscribe {
          context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")))
        }
    }

  }
}