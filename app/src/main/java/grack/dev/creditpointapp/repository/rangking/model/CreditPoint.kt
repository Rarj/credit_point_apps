package grack.dev.creditpointapp.repository.rangking.model


import com.google.gson.annotations.SerializedName

data class CreditPoint(
  @SerializedName("default_point")
  var defaultPoint: String?,
  @SerializedName("nama")
  var nama: String?,
  @SerializedName("nama_kelas")
  var namaKelas: String?,
  @SerializedName("sisa_point")
  var sisaPoint: String?
)