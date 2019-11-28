package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRangkingSiswaBindingImpl extends ItemRangkingSiswaBinding  {

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

    public ItemRangkingSiswaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemRangkingSiswaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textNamaSiswa.setTag(null);
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
        if (BR.model == variableId) {
            setModel((grack.dev.creditpointapp.repository.rangking.model.CreditPoint) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable grack.dev.creditpointapp.repository.rangking.model.CreditPoint Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        grack.dev.creditpointapp.repository.rangking.model.CreditPoint model = mModel;
        java.lang.String modelNamaKelas = null;
        java.lang.String modelNamaJavaLangString = null;
        java.lang.String modelNamaJavaLangStringModelNamaKelas = null;
        java.lang.String modelSisaPoint = null;
        java.lang.String modelNama = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.namaKelas
                    modelNamaKelas = model.getNamaKelas();
                    // read model.sisaPoint
                    modelSisaPoint = model.getSisaPoint();
                    // read model.nama
                    modelNama = model.getNama();
                }


                // read (model.nama) + (" - ")
                modelNamaJavaLangString = (modelNama) + (" - ");


                // read ((model.nama) + (" - ")) + (model.namaKelas)
                modelNamaJavaLangStringModelNamaKelas = (modelNamaJavaLangString) + (modelNamaKelas);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaSiswa, modelNamaJavaLangStringModelNamaKelas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPoint, modelSisaPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}