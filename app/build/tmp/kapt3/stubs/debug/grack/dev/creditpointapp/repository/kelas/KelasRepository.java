package grack.dev.creditpointapp.repository.kelas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a8\u0006\r"}, d2 = {"Lgrack/dev/creditpointapp/repository/kelas/KelasRepository;", "", "()V", "provideDetailSiswa", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/kelas/model/siswa/siswa/DataSiswaResponse;", "idKelas", "", "provideKategoriKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/kategorikelas/KategoriKelasResponse;", "kelas", "provideKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/kelas/KelasResponse;", "app_debug"})
public final class KelasRepository {
    public static final grack.dev.creditpointapp.repository.kelas.KelasRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse> provideKelas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse> provideKategoriKelas(@org.jetbrains.annotations.NotNull()
    java.lang.String kelas) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse> provideDetailSiswa(@org.jetbrains.annotations.Nullable()
    java.lang.String idKelas) {
        return null;
    }
    
    private KelasRepository() {
        super();
    }
}