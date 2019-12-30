// Generated by data binding compiler. Do not edit!
package grack.dev.creditpointapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import grack.dev.creditpointapp.R;
import grack.dev.creditpointapp.features.login.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonLogin;

  @NonNull
  public final AppCompatCheckBox checkboxWaliMurid;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final AppCompatImageView imageLogin;

  @NonNull
  public final TextInputEditText inputEmail;

  @NonNull
  public final TextInputLayout inputLayoutEmail;

  @NonNull
  public final TextInputLayout inputLayoutPassword;

  @NonNull
  public final TextInputEditText inputPassword;

  @Bindable
  protected LoginViewModel mViewModel;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonLogin, AppCompatCheckBox checkboxWaliMurid, ConstraintLayout container,
      AppCompatImageView imageLogin, TextInputEditText inputEmail, TextInputLayout inputLayoutEmail,
      TextInputLayout inputLayoutPassword, TextInputEditText inputPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonLogin = buttonLogin;
    this.checkboxWaliMurid = checkboxWaliMurid;
    this.container = container;
    this.imageLogin = imageLogin;
    this.inputEmail = inputEmail;
    this.inputLayoutEmail = inputLayoutEmail;
    this.inputLayoutPassword = inputLayoutPassword;
    this.inputPassword = inputPassword;
  }

  public abstract void setViewModel(@Nullable LoginViewModel viewModel);

  @Nullable
  public LoginViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
