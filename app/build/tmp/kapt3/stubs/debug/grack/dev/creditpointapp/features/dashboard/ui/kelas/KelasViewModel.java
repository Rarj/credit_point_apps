package grack.dev.creditpointapp.features.dashboard.ui.kelas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\r"}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/kelas/KelasViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "listKategoriKelas", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/kelas/model/kategorikelas/KategoriKelasResponse;", "kelas", "", "listKelas", "Lgrack/dev/creditpointapp/repository/kelas/model/kelas/KelasResponse;", "listSiswa", "Lgrack/dev/creditpointapp/repository/kelas/model/siswa/siswa/DataSiswaResponse;", "idKelas", "app_debug"})
public final class KelasViewModel extends androidx.lifecycle.ViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kelas.KelasResponse> listKelas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse> listKategoriKelas(@org.jetbrains.annotations.NotNull()
    java.lang.String kelas) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse> listSiswa(@org.jetbrains.annotations.Nullable()
    java.lang.String idKelas) {
        return null;
    }
    
    public KelasViewModel() {
        super();
    }
}