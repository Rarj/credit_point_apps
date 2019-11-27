package grack.dev.creditpointapp.repository.datapelanggaran.model


import com.google.gson.annotations.SerializedName

data class Point(
  @SerializedName("created_by")
  var createdBy: String? = "",
  @SerializedName("created_date")
  var createdDate: String? = "",
  @SerializedName("deleted_by")
  var deletedBy: Any? = null,
  @SerializedName("deleted_date")
  var deletedDate: Any? = null,
  @SerializedName("id_point")
  var idPoint: String? = "",
  @SerializedName("is_delete")
  var isDelete: String? = "",
  @SerializedName("kategori")
  var kategori: String? = "",
  @SerializedName("keterangan_point")
  var keteranganPoint: String? = "",
  @SerializedName("point")
  var point: String? = "",
  @SerializedName("updated_by")
  var updatedBy: String? = "",
  @SerializedName("updated_date")
  var updatedDate: String? = ""
) {
  override fun toString(): String {
    return keteranganPoint.toString()
  }
}