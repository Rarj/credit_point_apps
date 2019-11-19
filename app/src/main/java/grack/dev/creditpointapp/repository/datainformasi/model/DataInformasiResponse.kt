package grack.dev.creditpointapp.repository.datainformasi.model


import com.google.gson.annotations.SerializedName

data class DataInformasiResponse(
    @SerializedName("information")
    var information: List<Information?>
)