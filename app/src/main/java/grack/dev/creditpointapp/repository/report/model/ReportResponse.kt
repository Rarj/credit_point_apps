package grack.dev.creditpointapp.repository.report.model


import com.google.gson.annotations.SerializedName

data class ReportResponse(
  @SerializedName("credit_point")
  var creditPoint: List<CreditPoint?>?,
  @SerializedName("status")
  var status: String?
)