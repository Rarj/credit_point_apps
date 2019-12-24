package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemReportBindingImpl extends ItemReportBinding  {

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

    public ItemReportBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemReportBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textDateCreated.setTag(null);
        this.textKategori.setTag(null);
        this.textName.setTag(null);
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
            setModel((grack.dev.creditpointapp.repository.report.model.CreditPoint) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable grack.dev.creditpointapp.repository.report.model.CreditPoint Model) {
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
        grack.dev.creditpointapp.repository.report.model.CreditPoint model = mModel;
        java.lang.String modelKeteranganPoint = null;
        java.lang.String modelPoint = null;
        java.lang.String modelKategoriJavaLangStringModelKeteranganPointJavaLangStringModelPoint = null;
        java.lang.String modelNama = null;
        java.lang.String javaLangStringDateCreatedModelCreatedDate = null;
        java.lang.String modelKategori = null;
        java.lang.String modelCreatedDate = null;
        java.lang.String modelKategoriJavaLangStringModelKeteranganPointJavaLangString = null;
        java.lang.String modelKategoriJavaLangString = null;
        java.lang.String modelKategoriJavaLangStringModelKeteranganPoint = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.keteranganPoint
                    modelKeteranganPoint = model.getKeteranganPoint();
                    // read model.point
                    modelPoint = model.getPoint();
                    // read model.nama
                    modelNama = model.getNama();
                    // read model.kategori
                    modelKategori = model.getKategori();
                    // read model.createdDate
                    modelCreatedDate = model.getCreatedDate();
                }


                // read (model.kategori) + (" - ")
                modelKategoriJavaLangString = (modelKategori) + (" - ");
                // read ("Date created : ") + (model.createdDate)
                javaLangStringDateCreatedModelCreatedDate = ("Date created : ") + (modelCreatedDate);


                // read ((model.kategori) + (" - ")) + (model.keteranganPoint)
                modelKategoriJavaLangStringModelKeteranganPoint = (modelKategoriJavaLangString) + (modelKeteranganPoint);


                // read (((model.kategori) + (" - ")) + (model.keteranganPoint)) + (" - ")
                modelKategoriJavaLangStringModelKeteranganPointJavaLangString = (modelKategoriJavaLangStringModelKeteranganPoint) + (" - ");


                // read ((((model.kategori) + (" - ")) + (model.keteranganPoint)) + (" - ")) + (model.point)
                modelKategoriJavaLangStringModelKeteranganPointJavaLangStringModelPoint = (modelKategoriJavaLangStringModelKeteranganPointJavaLangString) + (modelPoint);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textDateCreated, javaLangStringDateCreatedModelCreatedDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textKategori, modelKategoriJavaLangStringModelKeteranganPointJavaLangStringModelPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textName, modelNama);
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