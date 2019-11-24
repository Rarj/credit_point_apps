package grack.dev.creditpointapp.repository.kelas.model.siswa.detail


import com.google.gson.annotations.SerializedName

data class Siswa(
  @SerializedName("alamat")
  var alamat: String?,
  @SerializedName("alamat_ayah")
  var alamatAyah: String?,
  @SerializedName("alamat_ibu")
  var alamatIbu: String?,
  @SerializedName("alamat_wali")
  var alamatWali: String?,
  @SerializedName("anak_ke")
  var anakKe: String?,
  @SerializedName("created_by")
  var createdBy: String?,
  @SerializedName("created_date")
  var createdDate: String?,
  @SerializedName("deleted_by")
  var deletedBy: Any?,
  @SerializedName("deleted_date")
  var deletedDate: Any?,
  @SerializedName("id_kelas")
  var idKelas: String?,
  @SerializedName("id_siswa")
  var idSiswa: String?,
  @SerializedName("is_deleted")
  var isDeleted: String?,
  @SerializedName("jenis_kelamin")
  var jenisKelamin: String?,
  @SerializedName("jumlah_saudara")
  var jumlahSaudara: String?,
  @SerializedName("nama")
  var nama: String?,
  @SerializedName("nama_ayah")
  var namaAyah: String?,
  @SerializedName("nama_ibu")
  var namaIbu: String?,
  @SerializedName("nama_wali")
  var namaWali: String?,
  @SerializedName("no_telp")
  var noTelp: String?,
  @SerializedName("no_telp_ayah")
  var noTelpAyah: String?,
  @SerializedName("no_telp_ibu")
  var noTelpIbu: String?,
  @SerializedName("no_telp_wali")
  var noTelpWali: String?,
  @SerializedName("pekerjaan_ayah")
  var pekerjaanAyah: String?,
  @SerializedName("pekerjaan_ibu")
  var pekerjaanIbu: String?,
  @SerializedName("pekerjaan_wali")
  var pekerjaanWali: String?,
  @SerializedName("penghasilan_ayah")
  var penghasilanAyah: String?,
  @SerializedName("penghasilan_ibu")
  var penghasilanIbu: String?,
  @SerializedName("penghasilan_wali")
  var penghasilanWali: String?,
  @SerializedName("tempat_lahir")
  var tempatLahir: String?,
  @SerializedName("tgl_lahir")
  var tglLahir: String?,
  @SerializedName("updated_by")
  var updatedBy: Any?,
  @SerializedName("updated_date")
  var updatedDate: Any?
)