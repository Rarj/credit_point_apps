package grack.dev.creditpointapp.features.loginwalimurid.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lgrack/dev/creditpointapp/features/loginwalimurid/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "pelanggaranList", "Landroidx/lifecycle/MutableLiveData;", "", "Lgrack/dev/creditpointapp/repository/loginwalimurid/history/model/Pelanggaran;", "getPelanggaranList", "()Landroidx/lifecycle/MutableLiveData;", "prestasiList", "Lgrack/dev/creditpointapp/repository/loginwalimurid/history/model/Prestasi;", "getPrestasiList", "loadHistory", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/loginwalimurid/history/model/HistoryResponse;", "idSiswa", "", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi>> prestasiList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran>> pelanggaranList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi>> getPrestasiList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran>> getPelanggaranList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.loginwalimurid.history.model.HistoryResponse> loadHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String idSiswa) {
        return null;
    }
    
    public HistoryViewModel() {
        super();
    }
}