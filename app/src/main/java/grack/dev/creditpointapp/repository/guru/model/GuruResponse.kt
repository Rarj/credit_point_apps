package grack.dev.creditpointapp.repository.guru.model


import com.google.gson.annotations.SerializedName

data class GuruResponse(
  @SerializedName("guru")
  var guru: List<Guru?>?,
  @SerializedName("status")
  var status: String?
)