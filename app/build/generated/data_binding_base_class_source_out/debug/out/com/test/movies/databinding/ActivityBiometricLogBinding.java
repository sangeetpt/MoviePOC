// Generated by data binding compiler. Do not edit!
package com.test.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.test.movies.R;
import com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityBiometricLogBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText password;

  @NonNull
  public final SwitchCompat touchID;

  @NonNull
  public final EditText username;

  @NonNull
  public final TextView validateResult;

  @Bindable
  protected BiometricLoginViewModel mBiometricLoginViewModel;

  protected ActivityBiometricLogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout container, Button login, EditText password, SwitchCompat touchID,
      EditText username, TextView validateResult) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.login = login;
    this.password = password;
    this.touchID = touchID;
    this.username = username;
    this.validateResult = validateResult;
  }

  public abstract void setBiometricLoginViewModel(
      @Nullable BiometricLoginViewModel BiometricLoginViewModel);

  @Nullable
  public BiometricLoginViewModel getBiometricLoginViewModel() {
    return mBiometricLoginViewModel;
  }

  @NonNull
  public static ActivityBiometricLogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_biometric_log, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBiometricLogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityBiometricLogBinding>inflateInternal(inflater, R.layout.activity_biometric_log, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBiometricLogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_biometric_log, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBiometricLogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityBiometricLogBinding>inflateInternal(inflater, R.layout.activity_biometric_log, null, false, component);
  }

  public static ActivityBiometricLogBinding bind(@NonNull View view) {
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
  public static ActivityBiometricLogBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityBiometricLogBinding)bind(component, view, R.layout.activity_biometric_log);
  }
}
