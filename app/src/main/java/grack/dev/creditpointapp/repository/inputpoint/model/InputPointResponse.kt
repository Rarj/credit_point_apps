package grack.dev.creditpointapp.repository.inputpoint.model


import com.google.gson.annotations.SerializedName

data class InputPointResponse(
  @SerializedName("status")
  var status: String?
)