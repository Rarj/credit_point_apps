package grack.dev.creditpointapp.network

import grack.dev.creditpointapp.repository.datainformasi.model.DataInformasiResponse
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.detailsiswa.detail.DetailSiswaResponse
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse
import grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse
import grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import grack.dev.creditpointapp.repository.rangking.model.RangkingResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiConfig {

  @POST("login")
  fun requestLogin(@Body loginRequest: LoginRequest): Observable<LoginResponse>

  @GET("kelas")
  fun requestListKelas(): Observable<KelasResponse>

  @GET("kelas/kategori")
  fun requestKategoriKelas(@Query("kelas") kelas: String): Observable<KategoriKelasResponse>

  @GET("point")
  fun requestDataPelanggaran(): Observable<DataPelanggaran>

  @GET("information")
  fun requestDataInformasi(): Observable<DataInformasiResponse>

  @GET("siswa")
  fun requestSiswa(@Query("id_kelas") idKelas: String?): Observable<DataSiswaResponse>

  @GET("siswa/detail-siswa")
  fun requestDetailSiswa(@Query("id_siswa") idSiswa: String?): Observable<DetailSiswaResponse>

  @POST("credit-point/input")
  fun requestInputPoint(@Body requestModel: InputPointRequest?): Observable<InputPointResponse>

  @GET("credit-point/rangking")
  fun requestRangking(): Observable<RangkingResponse>

}