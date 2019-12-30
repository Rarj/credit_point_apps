package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDataKonsultasiSiswaBindingImpl extends ItemDataKonsultasiSiswaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button_whatsapp, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDataKonsultasiSiswaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemDataKonsultasiSiswaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.containerKonsultasiSiswa.setTag(null);
        this.textEmailWaliMurid.setTag(null);
        this.textNamaWaliMurid.setTag(null);
        this.textName.setTag(null);
        this.textNohpWaliMurid.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.modelWaliMurid == variableId) {
            setModelWaliMurid((grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid) variable);
        }
        else if (BR.modelSiswa == variableId) {
            setModelSiswa((grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModelWaliMurid(@Nullable grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid ModelWaliMurid) {
        this.mModelWaliMurid = ModelWaliMurid;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.modelWaliMurid);
        super.requestRebind();
    }
    public void setModelSiswa(@Nullable grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran ModelSiswa) {
        this.mModelSiswa = ModelSiswa;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.modelSiswa);
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
        java.lang.String modelWaliMuridNoHp = null;
        grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid modelWaliMurid = mModelWaliMurid;
        java.lang.String modelSiswaNama = null;
        grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran modelSiswa = mModelSiswa;
        java.lang.String modelWaliMuridEmailWaliMurid = null;
        java.lang.String modelWaliMuridNamaWaliMurid = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (modelWaliMurid != null) {
                    // read modelWaliMurid.noHp
                    modelWaliMuridNoHp = modelWaliMurid.getNoHp();
                    // read modelWaliMurid.emailWaliMurid
                    modelWaliMuridEmailWaliMurid = modelWaliMurid.getEmailWaliMurid();
                    // read modelWaliMurid.namaWaliMurid
                    modelWaliMuridNamaWaliMurid = modelWaliMurid.getNamaWaliMurid();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (modelSiswa != null) {
                    // read modelSiswa.nama
                    modelSiswaNama = modelSiswa.getNama();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textEmailWaliMurid, modelWaliMuridEmailWaliMurid);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaWaliMurid, modelWaliMuridNamaWaliMurid);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNohpWaliMurid, modelWaliMuridNoHp);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textName, modelSiswaNama);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): modelWaliMurid
        flag 1 (0x2L): modelSiswa
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}