package grack.dev.creditpointapp.repository.report.model


import com.google.gson.annotations.SerializedName

data class CreditPoint(
  @SerializedName("created_date")
  var createdDate: String?,
  @SerializedName("kategori")
  var kategori: String?,
  @SerializedName("keterangan_point")
  var keteranganPoint: String?,
  @SerializedName("nama")
  var nama: String?,
  @SerializedName("point")
  var point: String?
)