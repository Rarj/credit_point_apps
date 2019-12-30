package grack.dev.creditpointapp.repository.loginwalimurid.history.model


import com.google.gson.annotations.SerializedName

data class Pelanggaran(
  @SerializedName("id_point")
  var idPoint: String?,
  @SerializedName("jenis_pelanggaran")
  var jenisPelanggaran: String?,
  @SerializedName("jumlah")
  var jumlah: Int?
)