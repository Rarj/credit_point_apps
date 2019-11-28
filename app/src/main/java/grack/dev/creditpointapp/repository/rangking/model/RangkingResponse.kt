package grack.dev.creditpointapp.repository.rangking.model


import com.google.gson.annotations.SerializedName

data class RangkingResponse(
  @SerializedName("credit_point")
  var creditPoint: List<CreditPoint>,
  @SerializedName("status")
  var status: String?
)