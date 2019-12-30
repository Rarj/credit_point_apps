package grack.dev.creditpointapp.features.newdashboard.konsultasi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lgrack/dev/creditpointapp/features/newdashboard/konsultasi/KonsultasiAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgrack/dev/creditpointapp/features/newdashboard/konsultasi/KonsultasiAdapter$ViewHolder;", "context", "Landroid/content/Context;", "konsultasiList", "Lgrack/dev/creditpointapp/repository/konsultasi/model/KonsultasiResponse;", "(Landroid/content/Context;Lgrack/dev/creditpointapp/repository/konsultasi/model/KonsultasiResponse;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class KonsultasiAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<grack.dev.creditpointapp.features.newdashboard.konsultasi.KonsultasiAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse konsultasiList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public grack.dev.creditpointapp.features.newdashboard.konsultasi.KonsultasiAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.features.newdashboard.konsultasi.KonsultasiAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public KonsultasiAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.repository.konsultasi.model.KonsultasiResponse konsultasiList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lgrack/dev/creditpointapp/features/newdashboard/konsultasi/KonsultasiAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "modelSiswa", "Lgrack/dev/creditpointapp/repository/konsultasi/model/Pelanggaran;", "bindWaliMurid", "context", "Landroid/content/Context;", "modelWaliMurid", "Lgrack/dev/creditpointapp/repository/konsultasi/model/WaliMurid;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding viewDataBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran modelSiswa) {
        }
        
        @android.annotation.SuppressLint(value = {"CheckResult"})
        public final void bindWaliMurid(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid modelWaliMurid, @org.jetbrains.annotations.NotNull()
        grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran modelSiswa) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding viewDataBinding) {
            super(null);
        }
    }
}