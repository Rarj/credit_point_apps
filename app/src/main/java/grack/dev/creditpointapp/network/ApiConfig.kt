package grack.dev.creditpointapp.network

import grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran
import grack.dev.creditpointapp.repository.kelas.model.KelasResponse
import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiConfig {

  @POST("login")
  fun requestLogin(@Body loginRequest: LoginRequest): Observable<LoginResponse>

  @GET("kelas")
  fun requestListKelas(): Observable<KelasResponse>

  @GET("point")
  fun requestDataPelanggaran(): Observable<DataPelanggaran>

}