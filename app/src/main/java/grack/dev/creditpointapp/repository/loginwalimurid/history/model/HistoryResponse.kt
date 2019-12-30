package grack.dev.creditpointapp.repository.loginwalimurid.history.model


import com.google.gson.annotations.SerializedName

data class HistoryResponse(
  @SerializedName("pelanggaran")
  var pelanggaranParent: List<PelanggaranParent?>?,
  @SerializedName("status")
  var status: String?
)