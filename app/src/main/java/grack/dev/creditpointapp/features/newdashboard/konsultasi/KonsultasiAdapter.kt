package grack.dev.creditpointapp.features.newdashboard.konsultasi

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding3.view.clicks
import grack.dev.creditpointapp.BR
import grack.dev.creditpointapp.databinding.ItemDataKonsultasiSiswaBinding
import grack.dev.creditpointapp.preferences.SharedPref
import grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse
import grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran
import grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid
import kotlinx.android.synthetic.main.item_data_konsultasi_siswa.view.*
import java.util.concurrent.TimeUnit

class KonsultasiAdapter(
  val context: Context,
  private val konsultasiList: KonsultasiResponse
) : RecyclerView.Adapter<KonsultasiAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemDataKonsultasiSiswaBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount() = konsultasiList.pelanggaran.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(konsultasiList.pelanggaran[position])

    konsultasiList.pelanggaran[position].waliMurid.forEach { waliMurid ->
      holder.bindWaliMurid(context, waliMurid, konsultasiList.pelanggaran[position])
    }

  }

  class ViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(modelSiswa: Pelanggaran) {
      viewDataBinding.setVariable(BR.modelSiswa, modelSiswa)
      viewDataBinding.executePendingBindings()
    }

    @SuppressLint("CheckResult")
    fun bindWaliMurid(context: Context, modelWaliMurid: WaliMurid, modelSiswa: Pelanggaran) {
      viewDataBinding.setVariable(BR.modelWaliMurid, modelWaliMurid)
      viewDataBinding.executePendingBindings()

      viewDataBinding.root.container_konsultasi_siswa.clicks()
        .throttleFirst(500, TimeUnit.MILLISECONDS)
        .subscribe {
          if (modelWaliMurid.noHp.isNullOrBlank()) {
            Toast.makeText(context, "Tidak ada nomor yang bisa di hubungi.", Toast.LENGTH_SHORT).show()
          } else {
            var tlpWaliMurid = ""

            if (modelWaliMurid.noHp?.substring(0, 1) == "0") {
              tlpWaliMurid = modelWaliMurid.noHp.toString()

              val stringBuilder = StringBuilder(tlpWaliMurid)
              stringBuilder.replace(0, 1, "62")
              Log.e("ASLKDJAKLSJDAKLSD", stringBuilder.toString())

              var pelanggarangList = ArrayList<String>()

              modelSiswa.pelanggaran.forEach { pelanggaran ->
                pelanggarangList.add(pelanggaran.jenisPelanggaran.toString() + ".")
              }

              val text = "Selamat pagi, Pak/Bu. " +
                    "Saya ${SharedPref.getUser(context).namaAdmin}, ${SharedPref.getUser(context).statusAdmin} " +
                    "dari ${modelSiswa.nama}. " +
                    "Saya ingin menginformasikan bahwa siswa yang bersangkutan telah melakukan pelanggaranParent sebagai berikut : \n " +
                    "${pelanggarangList}.\n\n Silahkan untuk membalas pesan ini untuk melanjutkan konsultasi. \n\n " +
                    "Terima kasih"

              val intentExport = Intent(Intent.ACTION_VIEW)
              intentExport.data = Uri.parse(
                "https://api.whatsapp.com/send?phone=${tlpWaliMurid}&text=${text}"
              )
              context.startActivity(intentExport)
            } else {
              var pelanggarangList = ArrayList<String>()

              modelSiswa.pelanggaran.forEach { pelanggaran ->
                pelanggarangList.add(pelanggaran.jenisPelanggaran.toString() + ".")
              }

              val text = "Selamat pagi, Pak/Bu. " +
                    "Saya ${SharedPref.getUser(context).namaAdmin}, ${SharedPref.getUser(context).statusAdmin} " +
                    "dari ${modelSiswa.nama}. " +
                    "Saya ingin menginformasikan bahwa siswa yang bersangkutan telah melakukan pelanggaranParent sebagai berikut : \n " +
                    "${pelanggarangList}.\n\n Silahkan untuk membalas pesan ini untuk melanjutkan konsultasi. \n\n " +
                    "Terima kasih"

              val intentExport = Intent(Intent.ACTION_VIEW)
              intentExport.data = Uri.parse(
                "https://api.whatsapp.com/send?phone=${modelWaliMurid.noHp.toString()}&text=${text}"
              )
              context.startActivity(intentExport)
            }

          }
        }

    }
  }

}