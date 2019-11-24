package grack.dev.creditpointapp.repository.detailsiswa.detail


import com.google.gson.annotations.SerializedName

data class DetailSiswaResponse(
    @SerializedName("siswa")
    var siswa: List<Siswa?>?,
    @SerializedName("status")
    var status: String?
)