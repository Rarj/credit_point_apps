package grack.dev.creditpointapp.databinding;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailSiswaBindingImpl extends ActivityDetailSiswaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 19);
        sViewsWithIds.put(R.id.button_back, 20);
        sViewsWithIds.put(R.id.text_title, 21);
        sViewsWithIds.put(R.id.container_siswa, 22);
        sViewsWithIds.put(R.id.text_caption_parent1, 23);
        sViewsWithIds.put(R.id.container_data_ayah, 24);
        sViewsWithIds.put(R.id.text_caption_parent2, 25);
        sViewsWithIds.put(R.id.container_data_ibu, 26);
        sViewsWithIds.put(R.id.button_input, 27);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailSiswaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityDetailSiswaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[20]
            , (com.google.android.material.button.MaterialButton) bindings[27]
            , (com.google.android.material.card.MaterialCardView) bindings[24]
            , (com.google.android.material.card.MaterialCardView) bindings[26]
            , (com.google.android.material.card.MaterialCardView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.textAddressSiswa.setTag(null);
        this.textAlamatAyahSiswa.setTag(null);
        this.textAlamatIbuSiswa.setTag(null);
        this.textAnakKeSiswa.setTag(null);
        this.textDateBirthSiswa.setTag(null);
        this.textGenderSiswa.setTag(null);
        this.textJumlahSaudaraSiswa.setTag(null);
        this.textNamaAyahSiswa.setTag(null);
        this.textNamaIbuSiswa.setTag(null);
        this.textNamaSiswa.setTag(null);
        this.textNohpAyahSiswa.setTag(null);
        this.textNohpIbuSiswa.setTag(null);
        this.textNohpSiswa.setTag(null);
        this.textPekerjaanAyahSiswa.setTag(null);
        this.textPekerjaanIbuSiswa.setTag(null);
        this.textPenghasilanAyahSiswa.setTag(null);
        this.textPenghasilanIbuSiswa.setTag(null);
        this.textPlaceBirthSiswa.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDetailSiswa((androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDetailSiswa(androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaModel> ViewModelDetailSiswa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.lifecycle.MutableLiveData<grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaModel> viewModelDetailSiswa = null;
        java.lang.String viewModelDetailSiswaPenghasilanAyah = null;
        java.lang.String viewModelDetailSiswaJenisKelamin = null;
        java.lang.String viewModelDetailSiswaPekerjaanAyah = null;
        java.lang.String viewModelDetailSiswaNoTelpAyah = null;
        java.lang.String viewModelDetailSiswaNama = null;
        java.lang.String viewModelDetailSiswaNamaIbu = null;
        java.lang.String viewModelDetailSiswaAlamatIbu = null;
        java.lang.String viewModelDetailSiswaAnakKe = null;
        java.lang.String viewModelDetailSiswaNoTelpIbu = null;
        java.lang.String viewModelDetailSiswaAlamat = null;
        java.lang.String viewModelDetailSiswaTglLahir = null;
        grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaModel viewModelDetailSiswaGetValue = null;
        java.lang.String viewModelDetailSiswaPekerjaanIbu = null;
        java.lang.String viewModelDetailSiswaNoTelp = null;
        java.lang.String viewModelDetailSiswaPenghasilanIbu = null;
        java.lang.String viewModelDetailSiswaTempatLahir = null;
        java.lang.String viewModelDetailSiswaAlamatAyah = null;
        java.lang.String viewModelDetailSiswaNamaAyah = null;
        java.lang.String viewModelDetailSiswaJumlahSaudara = null;
        grack.dev.creditpointapp.features.dashboard.ui.kelas.detailsiswa.DetailSiswaViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.detailSiswa
                    viewModelDetailSiswa = viewModel.getDetailSiswa();
                }
                updateLiveDataRegistration(0, viewModelDetailSiswa);


                if (viewModelDetailSiswa != null) {
                    // read viewModel.detailSiswa.getValue()
                    viewModelDetailSiswaGetValue = viewModelDetailSiswa.getValue();
                }


                if (viewModelDetailSiswaGetValue != null) {
                    // read viewModel.detailSiswa.getValue().penghasilanAyah
                    viewModelDetailSiswaPenghasilanAyah = viewModelDetailSiswaGetValue.getPenghasilanAyah();
                    // read viewModel.detailSiswa.getValue().jenisKelamin
                    viewModelDetailSiswaJenisKelamin = viewModelDetailSiswaGetValue.getJenisKelamin();
                    // read viewModel.detailSiswa.getValue().pekerjaanAyah
                    viewModelDetailSiswaPekerjaanAyah = viewModelDetailSiswaGetValue.getPekerjaanAyah();
                    // read viewModel.detailSiswa.getValue().noTelpAyah
                    viewModelDetailSiswaNoTelpAyah = viewModelDetailSiswaGetValue.getNoTelpAyah();
                    // read viewModel.detailSiswa.getValue().nama
                    viewModelDetailSiswaNama = viewModelDetailSiswaGetValue.getNama();
                    // read viewModel.detailSiswa.getValue().namaIbu
                    viewModelDetailSiswaNamaIbu = viewModelDetailSiswaGetValue.getNamaIbu();
                    // read viewModel.detailSiswa.getValue().alamatIbu
                    viewModelDetailSiswaAlamatIbu = viewModelDetailSiswaGetValue.getAlamatIbu();
                    // read viewModel.detailSiswa.getValue().anakKe
                    viewModelDetailSiswaAnakKe = viewModelDetailSiswaGetValue.getAnakKe();
                    // read viewModel.detailSiswa.getValue().noTelpIbu
                    viewModelDetailSiswaNoTelpIbu = viewModelDetailSiswaGetValue.getNoTelpIbu();
                    // read viewModel.detailSiswa.getValue().alamat
                    viewModelDetailSiswaAlamat = viewModelDetailSiswaGetValue.getAlamat();
                    // read viewModel.detailSiswa.getValue().tglLahir
                    viewModelDetailSiswaTglLahir = viewModelDetailSiswaGetValue.getTglLahir();
                    // read viewModel.detailSiswa.getValue().pekerjaanIbu
                    viewModelDetailSiswaPekerjaanIbu = viewModelDetailSiswaGetValue.getPekerjaanIbu();
                    // read viewModel.detailSiswa.getValue().noTelp
                    viewModelDetailSiswaNoTelp = viewModelDetailSiswaGetValue.getNoTelp();
                    // read viewModel.detailSiswa.getValue().penghasilanIbu
                    viewModelDetailSiswaPenghasilanIbu = viewModelDetailSiswaGetValue.getPenghasilanIbu();
                    // read viewModel.detailSiswa.getValue().tempatLahir
                    viewModelDetailSiswaTempatLahir = viewModelDetailSiswaGetValue.getTempatLahir();
                    // read viewModel.detailSiswa.getValue().alamatAyah
                    viewModelDetailSiswaAlamatAyah = viewModelDetailSiswaGetValue.getAlamatAyah();
                    // read viewModel.detailSiswa.getValue().namaAyah
                    viewModelDetailSiswaNamaAyah = viewModelDetailSiswaGetValue.getNamaAyah();
                    // read viewModel.detailSiswa.getValue().jumlahSaudara
                    viewModelDetailSiswaJumlahSaudara = viewModelDetailSiswaGetValue.getJumlahSaudara();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textAddressSiswa, viewModelDetailSiswaAlamat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textAlamatAyahSiswa, viewModelDetailSiswaAlamatAyah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textAlamatIbuSiswa, viewModelDetailSiswaAlamatIbu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textAnakKeSiswa, viewModelDetailSiswaAnakKe);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textDateBirthSiswa, viewModelDetailSiswaTglLahir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textGenderSiswa, viewModelDetailSiswaJenisKelamin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textJumlahSaudaraSiswa, viewModelDetailSiswaJumlahSaudara);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaAyahSiswa, viewModelDetailSiswaNamaAyah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaIbuSiswa, viewModelDetailSiswaNamaIbu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaSiswa, viewModelDetailSiswaNama);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNohpAyahSiswa, viewModelDetailSiswaNoTelpAyah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNohpIbuSiswa, viewModelDetailSiswaNoTelpIbu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNohpSiswa, viewModelDetailSiswaNoTelp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPekerjaanAyahSiswa, viewModelDetailSiswaPekerjaanAyah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPekerjaanIbuSiswa, viewModelDetailSiswaPekerjaanIbu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPenghasilanAyahSiswa, viewModelDetailSiswaPenghasilanAyah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPenghasilanIbuSiswa, viewModelDetailSiswaPenghasilanIbu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPlaceBirthSiswa, viewModelDetailSiswaTempatLahir);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.detailSiswa
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}