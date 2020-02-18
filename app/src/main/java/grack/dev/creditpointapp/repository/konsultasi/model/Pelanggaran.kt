package grack.dev.creditpointapp.repository.konsultasi.model


import com.google.gson.annotations.SerializedName

data class Pelanggaran(
  @SerializedName("id_credit_point")
  var idCreditPoint: String?,
  @SerializedName("id_siswa")
  var idSiswa: String?,
  @SerializedName("nama")
  var nama: String?,
  @SerializedName("pelanggaran")
  var pelanggaran: List<PelanggaranMurid>,
  @SerializedName("wali_murid")
  var waliMurid: List<WaliMurid>
)