package grack.dev.creditpointapp.features.dashboard.ui.kelas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J0\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0016\u0010\u001a\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lgrack/dev/creditpointapp/features/dashboard/ui/kelas/KelasFragment;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "binding", "Lgrack/dev/creditpointapp/databinding/FragmentKelasBinding;", "kelasViewModel", "Lgrack/dev/creditpointapp/features/dashboard/ui/kelas/KelasViewModel;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "onNothingSelected", "setKategoriKelas", "kategoriKelasResponse", "Lgrack/dev/creditpointapp/repository/kelas/model/kategorikelas/KategoriKelasResponse;", "setSiswa", "dataSiswaResponse", "Lgrack/dev/creditpointapp/repository/kelas/model/siswa/siswa/DataSiswaResponse;", "app_debug"})
public final class KelasFragment extends androidx.appcompat.app.AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener {
    private grack.dev.creditpointapp.features.dashboard.ui.kelas.KelasViewModel kelasViewModel;
    private grack.dev.creditpointapp.databinding.FragmentKelasBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public KelasFragment() {
        super();
    }
}