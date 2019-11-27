package grack.dev.creditpointapp.repository.inputpoint.model

data class InputPointRequest(
  var id_siswa: String,
  var id_point: String,
  var created_by: String
)