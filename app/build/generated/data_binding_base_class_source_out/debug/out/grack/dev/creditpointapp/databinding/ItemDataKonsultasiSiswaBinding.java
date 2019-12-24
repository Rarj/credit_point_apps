// Generated by data binding compiler. Do not edit!
package grack.dev.creditpointapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grack.dev.creditpointapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDataKonsultasiSiswaBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageButton buttonWhatsapp;

  @NonNull
  public final ConstraintLayout containerKonsultasiSiswa;

  @NonNull
  public final AppCompatTextView textDateCreated;

  @NonNull
  public final AppCompatTextView textKategori;

  @NonNull
  public final AppCompatTextView textName;

  @Bindable
  protected String mModel;

  protected ItemDataKonsultasiSiswaBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageButton buttonWhatsapp,
      ConstraintLayout containerKonsultasiSiswa, AppCompatTextView textDateCreated,
      AppCompatTextView textKategori, AppCompatTextView textName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonWhatsapp = buttonWhatsapp;
    this.containerKonsultasiSiswa = containerKonsultasiSiswa;
    this.textDateCreated = textDateCreated;
    this.textKategori = textKategori;
    this.textName = textName;
  }

  public abstract void setModel(@Nullable String model);

  @Nullable
  public String getModel() {
    return mModel;
  }

  @NonNull
  public static ItemDataKonsultasiSiswaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_data_konsultasi_siswa, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDataKonsultasiSiswaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDataKonsultasiSiswaBinding>inflateInternal(inflater, R.layout.item_data_konsultasi_siswa, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDataKonsultasiSiswaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_data_konsultasi_siswa, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDataKonsultasiSiswaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDataKonsultasiSiswaBinding>inflateInternal(inflater, R.layout.item_data_konsultasi_siswa, null, false, component);
  }

  public static ItemDataKonsultasiSiswaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemDataKonsultasiSiswaBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemDataKonsultasiSiswaBinding)bind(component, view, R.layout.item_data_konsultasi_siswa);
  }
}
