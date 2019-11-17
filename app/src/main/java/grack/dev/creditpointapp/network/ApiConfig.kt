package grack.dev.creditpointapp.network

import grack.dev.creditpointapp.repository.login.LoginRequest
import grack.dev.creditpointapp.repository.login.model.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiConfig {

  @POST("api/login")
  fun requestLogin(@Body loginRequest: LoginRequest): Observable<LoginResponse>

}