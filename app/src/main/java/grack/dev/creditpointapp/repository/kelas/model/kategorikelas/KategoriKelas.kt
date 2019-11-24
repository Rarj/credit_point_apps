package grack.dev.creditpointapp.repository.kelas.model.kategorikelas


import com.google.gson.annotations.SerializedName

data class KategoriKelas(
    @SerializedName("id_kelas")
    var idKelas: String?,
    @SerializedName("is_delete")
    var isDelete: String?,
    @SerializedName("kelas")
    var kelas: String?,
    @SerializedName("nama_kelas")
    var namaKelas: String?
) {
    override fun toString(): String {
        return namaKelas.toString()
    }

    constructor():this("","","","")
}