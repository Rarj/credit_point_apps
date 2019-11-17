package grack.dev.creditpointapp.repository.login.model


import com.google.gson.annotations.SerializedName

data class LoginResponse(
  @SerializedName("message")
  var message: String?,
  @SerializedName("status")
  var status: String?,
  @SerializedName("user")
  var user: User?
)