package grack.dev.creditpointapp.network

import grack.dev.creditpointapp.repository.datainformasi.model.DataInformasiResponse
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse
import grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
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

}