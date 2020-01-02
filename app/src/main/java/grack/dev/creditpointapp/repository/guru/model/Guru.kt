package grack.dev.creditpointapp.repository.guru.model


import com.google.gson.annotations.SerializedName

data class Guru(
  @SerializedName("agama")
  var agama: String?,
  @SerializedName("alamat_rumah")
  var alamatRumah: String?,
  @SerializedName("created_by")
  var createdBy: String?,
  @SerializedName("created_date")
  var createdDate: String?,
  @SerializedName("delete_by")
  var deleteBy: Any?,
  @SerializedName("delete_date")
  var deleteDate: Any?,
  @SerializedName("foto")
  var foto: String?,
  @SerializedName("id_admin")
  var idAdmin: String?,
  @SerializedName("id_guru")
  var idGuru: String?,
  @SerializedName("id_jabatan")
  var idJabatan: String?,
  @SerializedName("ijazah_terakhir")
  var ijazahTerakhir: String?,
  @SerializedName("is_delete")
  var isDelete: String?,
  @SerializedName("mata_pelajaran")
  var mataPelajaran: String?,
  @SerializedName("nama_guru")
  var namaGuru: String?,
  @SerializedName("nama_ibu_kandung")
  var namaIbuKandung: String?,
  @SerializedName("nik")
  var nik: String?,
  @SerializedName("no_hp")
  var noHp: String?,
  @SerializedName("status_kawin")
  var statusKawin: String?,
  @SerializedName("tahun_ijazah_terakhir")
  var tahunIjazahTerakhir: String?,
  @SerializedName("tempat_lahir_guru")
  var tempatLahirGuru: String?,
  @SerializedName("tgl_lahir_guru")
  var tglLahirGuru: String?,
  @SerializedName("update_by")
  var updateBy: Any?,
  @SerializedName("update_date")
  var updateDate: Any?
)