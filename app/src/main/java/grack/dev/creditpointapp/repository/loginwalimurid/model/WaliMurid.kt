package grack.dev.creditpointapp.repository.loginwalimurid.model


import com.google.gson.annotations.SerializedName

data class WaliMurid(
  @SerializedName("alamat_wali_murid")
  var alamatWaliMurid: String?,
  @SerializedName("email_wali_murid")
  var emailWaliMurid: String?,
  @SerializedName("id_admin")
  var idAdmin: String?,
  @SerializedName("id_siswa")
  var idSiswa: String?,
  @SerializedName("id_wali_murid")
  var idWaliMurid: String?,
  @SerializedName("is_deleted")
  var isDeleted: String?,
  @SerializedName("jenis_kelamin")
  var jenisKelamin: String?,
  @SerializedName("nama_wali_murid")
  var namaWaliMurid: String?,
  @SerializedName("no_hp")
  var noHp: String?,
  @SerializedName("sisa_point_siswa")
  var siswaPointSiswa: String?
)