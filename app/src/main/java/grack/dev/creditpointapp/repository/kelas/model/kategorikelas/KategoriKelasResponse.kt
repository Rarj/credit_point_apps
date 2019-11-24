package grack.dev.creditpointapp.repository.kelas.model.kategorikelas


import com.google.gson.annotations.SerializedName

data class KategoriKelasResponse(
    @SerializedName("kategori_kelas")
    var kategoriKelas: List<KategoriKelas>?
)