package grack.dev.creditpointapp.repository.datapelanggaran.model


import com.google.gson.annotations.SerializedName

data class DataPelanggaran(
    @SerializedName("point")
    var point: List<Point?>
)