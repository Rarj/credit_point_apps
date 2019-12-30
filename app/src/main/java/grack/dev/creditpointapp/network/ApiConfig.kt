package grack.dev.creditpointapp.network

import grack.dev.creditpointapp.repository.datainformasi.model.DataInformasiResponse
import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.detailsiswa.detail.DetailSiswaResponse
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest
import grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse
import grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse
import grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse
import grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse
import grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import grack.dev.creditpointapp.repository.loginwalimurid.history.model.HistoryResponse
import grack.dev.creditpointapp.repository.loginwalimurid.model.LoginWaliMuridResponse
import grack.dev.creditpointapp.repository.rangking.model.RangkingResponse
import grack.dev.creditpointapp.repository.report.model.ReportResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiConfig {

  @POST("login")
  fun requestLogin(@Body loginRequest: LoginRequest): Observable<LoginResponse>

  @POST("login")
  fun requestLoginWaliMurid(@Body loginRequest: LoginRequest): Observable<LoginWaliMuridResponse>

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

  @GET("credit-point/report/daily")
  fun reportDaily(@Query("date") date: String): Observable<ReportResponse>

  @GET("credit-point/report/monthly")
  fun reportMonthly(@Query("month") month: String): Observable<ReportResponse>

  @GET("credit-point/report/yearly")
  fun reportYearly(@Query("year") year: String): Observable<ReportResponse>

  @GET("siswa/pelanggaran")
  fun konsultasiSiswa(): Observable<KonsultasiResponse>

  @GET("siswa/detail-pelanggaran")
  fun historyPelanggaran(@Query("id_siswa") id_siswa: String): Observable<HistoryResponse>
}