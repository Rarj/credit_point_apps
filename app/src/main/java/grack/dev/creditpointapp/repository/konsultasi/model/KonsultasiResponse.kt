package grack.dev.creditpointapp.repository.konsultasi.model


import com.google.gson.annotations.SerializedName

data class KonsultasiResponse(
  @SerializedName("pelanggaranParent")
  var pelanggaran: List<Pelanggaran>,
  @SerializedName("status")
  var status: String?
)