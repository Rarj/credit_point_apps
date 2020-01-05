package grack.dev.creditpointapp.preferences

data class UserPreferences(
  var alamatAdmin: String?,
  var emailAdmin: String?,
  var idAdmin: String?,
  var levelAdmin: String?,
  var namaAdmin: String?,
  var passwordAdmin: String?,
  var statusAdmin: String?,
  var foto: String?
)

data class WaliMuridPreferences(
  var idSiswa: String?,
  var alamatAdmin: String?,
  var emailAdmin: String?,
  var idAdmin: String?,
  var namaAdmin: String?,
  var statusAdmin: String?,
  var sisaPointSiswa: String?,
  var idWaliMurid: String?,
  var passwordWaliMurid: String?,
  var jenisKelaminWaliMurid: String?
)

data class UpdateWaliMuridPreferences(
  var id_wali_murid: String?,
  var nama_wali_murid: String?,
  var alamat_wali_murid: String?,
  var jenis_kelamin: String?,
  var email_wali_murid: String?,
  var password_wali_murid: String?
)