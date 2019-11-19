package grack.dev.creditpointapp.repository.kelas.model


import com.google.gson.annotations.SerializedName

data class KelasResponse(
    @SerializedName("kelas")
    var kelas: List<Kelas?>?
)