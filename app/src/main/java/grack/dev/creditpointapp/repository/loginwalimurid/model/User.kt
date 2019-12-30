package grack.dev.creditpointapp.repository.loginwalimurid.model


import com.google.gson.annotations.SerializedName

data class User(
  @SerializedName("alamat_admin")
  var alamatAdmin: String?,
  @SerializedName("email_admin")
  var emailAdmin: String?,
  @SerializedName("id_admin")
  var idAdmin: String?,
  @SerializedName("is_deleted")
  var isDeleted: String?,
  @SerializedName("level_admin")
  var levelAdmin: String?,
  @SerializedName("nama_admin")
  var namaAdmin: String?,
  @SerializedName("password_admin")
  var passwordAdmin: String?,
  @SerializedName("status_admin")
  var statusAdmin: String?
)