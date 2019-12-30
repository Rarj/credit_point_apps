package grack.dev.creditpointapp.repository.konsultasi.model


import com.google.gson.annotations.SerializedName

data class PelanggaranMurid(
  @SerializedName("id_point")
  var idPoint: String?,
  @SerializedName("jenis_pelanggaran")
  var jenisPelanggaran: String?,
  @SerializedName("jumlah")
  var jumlah: Int?
)