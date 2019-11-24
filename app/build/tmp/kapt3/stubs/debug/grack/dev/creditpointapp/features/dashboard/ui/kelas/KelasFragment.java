package grack.dev.creditpointapp.features.dashboard.ui.kelas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017J0\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0016\u0010\u0019\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/kelas/KelasFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "binding", "Lgrack/dev/creditpointapp/databinding/FragmentKelasBinding;", "kelasViewModel", "Lgrack/dev/creditpointapp/features/dashboard/ui/kelas/KelasViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "position", "", "id", "", "onNothingSelected", "setKategoriKelas", "kategoriKelasResponse", "Lgrack/dev/creditpointapp/repository/kelas/model/kategorikelas/KategoriKelasResponse;", "setSiswa", "dataSiswaResponse", "Lgrack/dev/creditpointapp/repository/kelas/model/siswa/siswa/DataSiswaResponse;", "app_debug"})
public final class KelasFragment extends androidx.fragment.app.Fragment implements android.widget.AdapterView.OnItemSelectedListener {
    private grack.dev.creditpointapp.features.dashboard.ui.kelas.KelasViewModel kelasViewModel;
    private grack.dev.creditpointapp.databinding.FragmentKelasBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    private final void setKategoriKelas(grack.dev.creditpointapp.repository.kelas.model.kategorikelas.KategoriKelasResponse kategoriKelasResponse) {
    }
    
    private final void setSiswa(grack.dev.creditpointapp.repository.kelas.model.siswa.siswa.DataSiswaResponse dataSiswaResponse) {
    }
    
    public KelasFragment() {
        super();
    }
}