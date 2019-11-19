package grack.dev.creditpointapp.repository.kelas.model.kelas


import com.google.gson.annotations.SerializedName
import grack.dev.creditpointapp.repository.kelas.model.kelas.Kelas

data class KelasResponse(
    @SerializedName("kelas")
    var kelas: List<Kelas?>?
)