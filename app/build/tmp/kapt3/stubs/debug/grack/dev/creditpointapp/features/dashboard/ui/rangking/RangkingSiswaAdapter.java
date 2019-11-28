package grack.dev.creditpointapp.features.dashboard.ui.rangking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/rangking/RangkingSiswaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lgrack/dev/creditpointapp/features/dashboard/ui/rangking/RangkingSiswaAdapter$ViewHolder;", "list", "Lgrack/dev/creditpointapp/repository/rangking/model/RangkingResponse;", "(Lgrack/dev/creditpointapp/repository/rangking/model/RangkingResponse;)V", "getList", "()Lgrack/dev/creditpointapp/repository/rangking/model/RangkingResponse;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RangkingSiswaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<grack.dev.creditpointapp.features.dashboard.ui.rangking.RangkingSiswaAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private final grack.dev.creditpointapp.repository.rangking.model.RangkingResponse list = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public grack.dev.creditpointapp.features.dashboard.ui.rangking.RangkingSiswaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    grack.dev.creditpointapp.features.dashboard.ui.rangking.RangkingSiswaAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final grack.dev.creditpointapp.repository.rangking.model.RangkingResponse getList() {
        return null;
    }
    
    public RangkingSiswaAdapter(@org.jetbrains.annotations.Nullable()
    grack.dev.creditpointapp.repository.rangking.model.RangkingResponse list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/rangking/RangkingSiswaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "creditPoint", "Lgrack/dev/creditpointapp/repository/rangking/model/CreditPoint;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding viewDataBinding = null;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        grack.dev.creditpointapp.repository.rangking.model.CreditPoint creditPoint) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding viewDataBinding) {
            super(null);
        }
    }
}