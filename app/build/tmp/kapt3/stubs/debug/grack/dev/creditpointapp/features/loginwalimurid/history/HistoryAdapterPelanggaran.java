package grack.dev.creditpointapp.features.loginwalimurid.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lgrack/dev/creditpointapp/features/loginwalimurid/history/HistoryAdapterPelanggaran;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgrack/dev/creditpointapp/features/loginwalimurid/history/HistoryAdapterPelanggaran$ViewHodler;", "pelanggaran", "", "Lgrack/dev/creditpointapp/repository/loginwalimurid/history/model/Pelanggaran;", "(Ljava/util/List;)V", "getPelanggaran", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "app_debug"})
public final class HistoryAdapterPelanggaran extends androidx.recyclerview.widget.RecyclerView.Adapter<grack.dev.creditpointapp.features.loginwalimurid.history.HistoryAdapterPelanggaran.ViewHodler> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran> pelanggaran = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public grack.dev.creditpointapp.features.loginwalimurid.history.HistoryAdapterPelanggaran.ViewHodler onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.features.loginwalimurid.history.HistoryAdapterPelanggaran.ViewHodler holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran> getPelanggaran() {
        return null;
    }
    
    public HistoryAdapterPelanggaran(@org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran> pelanggaran) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lgrack/dev/creditpointapp/features/loginwalimurid/history/HistoryAdapterPelanggaran$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "prestasi", "Lgrack/dev/creditpointapp/repository/loginwalimurid/history/model/Pelanggaran;", "app_debug"})
    public static final class ViewHodler extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding viewDataBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        grack.dev.creditpointapp.repository.loginwalimurid.history.model.Pelanggaran prestasi) {
        }
        
        public ViewHodler(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding viewDataBinding) {
            super(null);
        }
    }
}