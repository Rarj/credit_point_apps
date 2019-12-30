package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHistoryPrestasiSiswaBindingImpl extends ItemHistoryPrestasiSiswaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHistoryPrestasiSiswaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemHistoryPrestasiSiswaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textKeteranganPoint.setTag(null);
        this.textPoint.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModelPrestasi == variableId) {
            setViewModelPrestasi((grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelPrestasi(@Nullable grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi ViewModelPrestasi) {
        this.mViewModelPrestasi = ViewModelPrestasi;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModelPrestasi);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String javaLangStringJumlahViewModelPrestasiJumlah = null;
        grack.dev.creditpointapp.repository.loginwalimurid.history.model.Prestasi viewModelPrestasi = mViewModelPrestasi;
        java.lang.Integer viewModelPrestasiJumlah = null;
        java.lang.String javaLangStringJumlahViewModelPrestasiJumlahJavaLangStringX = null;
        java.lang.String viewModelPrestasiJenisPelanggaran = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModelPrestasi != null) {
                    // read viewModelPrestasi.jumlah
                    viewModelPrestasiJumlah = viewModelPrestasi.getJumlah();
                    // read viewModelPrestasi.jenisPelanggaran
                    viewModelPrestasiJenisPelanggaran = viewModelPrestasi.getJenisPelanggaran();
                }


                // read ("Jumlah - ") + (viewModelPrestasi.jumlah)
                javaLangStringJumlahViewModelPrestasiJumlah = ("Jumlah - ") + (viewModelPrestasiJumlah);


                // read (("Jumlah - ") + (viewModelPrestasi.jumlah)) + ("x")
                javaLangStringJumlahViewModelPrestasiJumlahJavaLangStringX = (javaLangStringJumlahViewModelPrestasiJumlah) + ("x");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textKeteranganPoint, viewModelPrestasiJenisPelanggaran);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPoint, javaLangStringJumlahViewModelPrestasiJumlahJavaLangStringX);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelPrestasi
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}