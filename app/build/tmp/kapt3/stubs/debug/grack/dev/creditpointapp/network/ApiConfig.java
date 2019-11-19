package grack.dev.creditpointapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lgrack/dev/creditpointapp/network/ApiConfig;", "", "requestDataPelanggaran", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/datapelanggaran/model/DataPelanggaran;", "requestListKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/KelasResponse;", "requestLogin", "Lgrack/dev/creditpointapp/repository/login/model/LoginResponse;", "loginRequest", "Lgrack/dev/creditpointapp/repository/login/LoginRequest;", "app_debug"})
public abstract interface ApiConfig {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.login.model.LoginResponse> requestLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    grack.dev.creditpointapp.repository.login.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "kelas")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.KelasResponse> requestListKelas();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "point")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> requestDataPelanggaran();
}