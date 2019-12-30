package grack.dev.creditpointapp.preferences

data class UserPreferences(
  var alamatAdmin: String?,
  var emailAdmin: String?,
  var idAdmin: String?,
  var levelAdmin: String?,
  var namaAdmin: String?,
  var passwordAdmin: String?,
  var statusAdmin: String?
)

data class WaliMuridPreferences(
  var idSiswa: String?,
  var alamatAdmin: String?,
  var emailAdmin: String?,
  var idAdmin: String?,
  var namaAdmin: String?,
  var statusAdmin: String?
)