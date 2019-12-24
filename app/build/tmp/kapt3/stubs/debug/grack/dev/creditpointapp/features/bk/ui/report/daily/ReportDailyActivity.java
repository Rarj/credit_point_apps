package grack.dev.creditpointapp.features.bk.ui.report.daily;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapterReportDaily", "Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyAdapter;", "getAdapterReportDaily", "()Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyAdapter;", "setAdapterReportDaily", "(Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyAdapter;)V", "binding", "Lgrack/dev/creditpointapp/databinding/ActivityReportDailyBinding;", "getBinding", "()Lgrack/dev/creditpointapp/databinding/ActivityReportDailyBinding;", "setBinding", "(Lgrack/dev/creditpointapp/databinding/ActivityReportDailyBinding;)V", "viewModel", "Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyViewModel;", "getViewModel", "()Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyViewModel;", "setViewModel", "(Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyViewModel;)V", "generateMonty", "", "month", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "response", "Lgrack/dev/creditpointapp/repository/report/model/ReportResponse;", "app_debug"})
public final class ReportDailyActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public grack.dev.creditpointapp.databinding.ActivityReportDailyBinding binding;
    @org.jetbrains.annotations.NotNull()
    public grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyAdapter adapterReportDaily;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.databinding.ActivityReportDailyBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.databinding.ActivityReportDailyBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyAdapter getAdapterReportDaily() {
        return null;
    }
    
    public final void setAdapterReportDaily(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.features.bk.ui.report.daily.ReportDailyAdapter p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult", "SimpleDateFormat"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setAdapter(grack.dev.creditpointapp.repository.report.model.ReportResponse response) {
    }
    
    private final void generateMonty(int month) {
    }
    
    public ReportDailyActivity() {
        super();
    }
}