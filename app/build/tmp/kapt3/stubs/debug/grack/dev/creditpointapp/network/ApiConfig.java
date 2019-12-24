package grack.dev.creditpointapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\n\u001a\u00020\bH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\f\u001a\u00020\bH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\'J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\bH\'J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u001a\u001a\u00020\bH\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H\'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u001f\u001a\u00020 H\'J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0003H\'J\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\bH\'\u00a8\u0006&"}, d2 = {"Lgrack/dev/creditpointapp/network/ApiConfig;", "", "konsultasiSiswa", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/konsultasi/model/KonsultasiResponse;", "reportDaily", "Lgrack/dev/creditpointapp/repository/report/model/ReportResponse;", "date", "", "reportMonthly", "month", "reportYearly", "year", "requestDataInformasi", "Lgrack/dev/creditpointapp/repository/datainformasi/model/DataInformasiResponse;", "requestDataPelanggaran", "Lgrack/dev/creditpointapp/repository/datapelanggaran/model/DataPelanggaran;", "requestDetailSiswa", "Lgrack/dev/creditpointapp/repository/detailsiswa/detail/DetailSiswaResponse;", "idSiswa", "requestInputPoint", "Lgrack/dev/creditpointapp/repository/inputpoint/model/InputPointResponse;", "requestModel", "Lgrack/dev/creditpointapp/repository/inputpoint/model/InputPointRequest;", "requestKategoriKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/kategorikelas/KategoriKelasResponse;", "kelas", "requestListKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/kelas/KelasResponse;", "requestLogin", "Lgrack/dev/creditpointapp/repository/login/model/LoginResponse;", "loginRequest", "Lgrack/dev/creditpointapp/repository/login/LoginRequest;", "requestRangking", "Lgrack/dev/creditpointapp/repository/rangking/model/RangkingResponse;", "requestSiswa", "Lgrack/dev/creditpointapp/repository/kelas/model/siswa/siswa/DataSiswaResponse;", "idKelas", "app_debug"})
public abstract interface ApiConfig {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.login.model.LoginResponse> requestLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    grack.dev.creditpointapp.repository.login.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "kelas")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse> requestListKelas();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "kelas/kategori")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse> requestKategoriKelas(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "kelas")
    java.lang.String kelas);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "point")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> requestDataPelanggaran();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "information")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.datainformasi.model.DataInformasiResponse> requestDataInformasi();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "siswa")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse> requestSiswa(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id_kelas")
    java.lang.String idKelas);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "siswa/detail-siswa")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.detailsiswa.detail.DetailSiswaResponse> requestDetailSiswa(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id_siswa")
    java.lang.String idSiswa);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "credit-point/input")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse> requestInputPoint(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest requestModel);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "credit-point/rangking")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.rangking.model.RangkingResponse> requestRangking();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "credit-point/report/daily")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> reportDaily(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date")
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "credit-point/report/monthly")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> reportMonthly(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "month")
    java.lang.String month);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "credit-point/report/yearly")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> reportYearly(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "year")
    java.lang.String year);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/seluruhsiswa/nihyaaaa")
    public abstract io.reactivex.Observable<grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse> konsultasiSiswa();
}