package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemListGuruBindingImpl extends ItemListGuruBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListGuruBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemListGuruBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textNamaGuru.setTag(null);
        this.textTtlGuru.setTag(null);
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
        if (BR.modelGuru == variableId) {
            setModelGuru((grack.dev.creditpointapp.repository.guru.model.Guru) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModelGuru(@Nullable grack.dev.creditpointapp.repository.guru.model.Guru ModelGuru) {
        this.mModelGuru = ModelGuru;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.modelGuru);
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
        java.lang.String modelGuruTempatLahirGuruJavaLangString = null;
        java.lang.String modelGuruTglLahirGuru = null;
        java.lang.String modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringN = null;
        java.lang.String modelGuruNamaGuruJavaLangStringModelGuruNik = null;
        java.lang.String modelGuruNamaGuruJavaLangString = null;
        java.lang.String modelGuruTempatLahirGuru = null;
        java.lang.String modelGuruNoHp = null;
        java.lang.String modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringNModelGuruNoHp = null;
        grack.dev.creditpointapp.repository.guru.model.Guru modelGuru = mModelGuru;
        java.lang.String modelGuruNik = null;
        java.lang.String modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuru = null;
        java.lang.String modelGuruNamaGuru = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (modelGuru != null) {
                    // read modelGuru.tglLahirGuru
                    modelGuruTglLahirGuru = modelGuru.getTglLahirGuru();
                    // read modelGuru.tempatLahirGuru
                    modelGuruTempatLahirGuru = modelGuru.getTempatLahirGuru();
                    // read modelGuru.noHp
                    modelGuruNoHp = modelGuru.getNoHp();
                    // read modelGuru.nik
                    modelGuruNik = modelGuru.getNik();
                    // read modelGuru.namaGuru
                    modelGuruNamaGuru = modelGuru.getNamaGuru();
                }


                // read (modelGuru.tempatLahirGuru) + (", ")
                modelGuruTempatLahirGuruJavaLangString = (modelGuruTempatLahirGuru) + (", ");
                // read (modelGuru.namaGuru) + (" - ")
                modelGuruNamaGuruJavaLangString = (modelGuruNamaGuru) + (" - ");


                // read ((modelGuru.tempatLahirGuru) + (", ")) + (modelGuru.tglLahirGuru)
                modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuru = (modelGuruTempatLahirGuruJavaLangString) + (modelGuruTglLahirGuru);
                // read ((modelGuru.namaGuru) + (" - ")) + (modelGuru.nik)
                modelGuruNamaGuruJavaLangStringModelGuruNik = (modelGuruNamaGuruJavaLangString) + (modelGuruNik);


                // read (((modelGuru.tempatLahirGuru) + (", ")) + (modelGuru.tglLahirGuru)) + ("\n")
                modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringN = (modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuru) + ("\n");


                // read ((((modelGuru.tempatLahirGuru) + (", ")) + (modelGuru.tglLahirGuru)) + ("\n")) + (modelGuru.noHp)
                modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringNModelGuruNoHp = (modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringN) + (modelGuruNoHp);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaGuru, modelGuruNamaGuruJavaLangStringModelGuruNik);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTtlGuru, modelGuruTempatLahirGuruJavaLangStringModelGuruTglLahirGuruJavaLangStringNModelGuruNoHp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): modelGuru
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}