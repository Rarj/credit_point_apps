package grack.dev.creditpointapp.features.bk.ui.report.daily;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lgrack/dev/creditpointapp/features/bk/ui/report/daily/ReportDailyViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dateSelected", "Landroidx/lifecycle/MutableLiveData;", "", "getDateSelected", "()Landroidx/lifecycle/MutableLiveData;", "monthSelected", "getMonthSelected", "yearSelected", "getYearSelected", "loadReportDaily", "Lio/reactivex/Observable;", "Lgrack/dev/creditpointapp/repository/report/model/ReportResponse;", "date", "loadReportMonthly", "month", "loadReportYearly", "year", "app_debug"})
public final class ReportDailyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateSelected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> monthSelected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> yearSelected = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMonthSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYearSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> loadReportDaily(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> loadReportMonthly(@org.jetbrains.annotations.NotNull()
    java.lang.String month) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<grack.dev.creditpointapp.repository.report.model.ReportResponse> loadReportYearly(@org.jetbrains.annotations.NotNull()
    java.lang.String year) {
        return null;
    }
    
    public ReportDailyViewModel() {
        super();
    }
}