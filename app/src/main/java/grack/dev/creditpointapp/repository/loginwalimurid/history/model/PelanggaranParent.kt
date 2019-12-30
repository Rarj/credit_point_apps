package grack.dev.creditpointapp.repository.loginwalimurid.history.model


import com.google.gson.annotations.SerializedName

data class PelanggaranParent(
  @SerializedName("id_credit_point")
  var idCreditPoint: String?,
  @SerializedName("id_siswa")
  var idSiswa: String?,
  @SerializedName("nama")
  var nama: String?,
  @SerializedName("pelanggaran")
  var pelanggaran: List<Pelanggaran?>?,
  @SerializedName("prestasi")
  var prestasi: List<Prestasi?>?
)