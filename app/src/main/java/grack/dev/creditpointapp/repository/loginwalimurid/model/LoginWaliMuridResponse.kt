package grack.dev.creditpointapp.repository.loginwalimurid.model


import com.google.gson.annotations.SerializedName

data class LoginWaliMuridResponse(
  @SerializedName("level")
  var level: String?,
  @SerializedName("message")
  var message: String?,
  @SerializedName("status")
  var status: String?,
  @SerializedName("user")
  var user: User?,
  @SerializedName("wali_murid")
  var waliMurid: List<WaliMurid>
)