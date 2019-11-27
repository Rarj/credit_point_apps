package grack.dev.creditpointapp.features.dashboard.ui.inputpoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/inputpoint/InputPointViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataPelanggaran", "Landroidx/lifecycle/MutableLiveData;", "Lgrack/dev/creditpointapp/repository/datapelanggaran/model/DataPelanggaran;", "getDataPelanggaran", "()Landroidx/lifecycle/MutableLiveData;", "setDataPelanggaran", "(Landroidx/lifecycle/MutableLiveData;)V", "inputPoint", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/inputpoint/model/InputPointResponse;", "request", "Lgrack/dev/creditpointapp/repository/inputpoint/model/InputPointRequest;", "loadPoint", "app_debug"})
public final class InputPointViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> dataPelanggaran;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> getDataPelanggaran() {
        return null;
    }
    
    public final void setDataPelanggaran(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.datapelanggaran.model.DataPelanggaran> loadPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.inputpoint.model.InputPointResponse> inputPoint(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.repository.inputpoint.model.InputPointRequest request) {
        return null;
    }
    
    public InputPointViewModel() {
        super();
    }
}