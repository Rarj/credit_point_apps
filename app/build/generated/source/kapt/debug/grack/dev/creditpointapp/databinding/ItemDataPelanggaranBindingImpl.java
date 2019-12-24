package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDataPelanggaranBindingImpl extends ItemDataPelanggaranBinding  {

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

    public ItemDataPelanggaranBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemDataPelanggaranBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.viewModel == variableId) {
            setViewModel((grack.dev.creditpointapp.repository.datapelanggaran.model.Point) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grack.dev.creditpointapp.repository.datapelanggaran.model.Point ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        java.lang.String viewModelKategori = null;
        java.lang.String viewModelKategoriJavaLangString = null;
        java.lang.String viewModelKeteranganPoint = null;
        java.lang.String viewModelPoint = null;
        grack.dev.creditpointapp.repository.datapelanggaran.model.Point viewModel = mViewModel;
        java.lang.String viewModelKategoriJavaLangStringViewModelPoint = null;
        java.lang.String viewModelKategoriJavaLangStringViewModelPointJavaLangStringPoint = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.kategori
                    viewModelKategori = viewModel.getKategori();
                    // read viewModel.keteranganPoint
                    viewModelKeteranganPoint = viewModel.getKeteranganPoint();
                    // read viewModel.point
                    viewModelPoint = viewModel.getPoint();
                }


                // read (viewModel.kategori) + (" ")
                viewModelKategoriJavaLangString = (viewModelKategori) + (" ");


                // read ((viewModel.kategori) + (" ")) + (viewModel.point)
                viewModelKategoriJavaLangStringViewModelPoint = (viewModelKategoriJavaLangString) + (viewModelPoint);


                // read (((viewModel.kategori) + (" ")) + (viewModel.point)) + (" point")
                viewModelKategoriJavaLangStringViewModelPointJavaLangStringPoint = (viewModelKategoriJavaLangStringViewModelPoint) + (" point");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textKeteranganPoint, viewModelKeteranganPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPoint, viewModelKategoriJavaLangStringViewModelPointJavaLangStringPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}