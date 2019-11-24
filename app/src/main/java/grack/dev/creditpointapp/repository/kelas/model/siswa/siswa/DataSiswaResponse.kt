package grack.dev.creditpointapp.repository.kelas.model.siswa.siswa


import com.google.gson.annotations.SerializedName

data class DataSiswaResponse(
  @SerializedName("siswa")
    var siswa: List<Siswa>?,
  @SerializedName("status")
    var status: String?
)