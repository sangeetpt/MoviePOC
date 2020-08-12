package com.test.movies.databinding;
import com.test.movies.R;
import com.test.movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBiometricLogBindingImpl extends ActivityBiometricLogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login, 3);
        sViewsWithIds.put(R.id.touchID, 4);
        sViewsWithIds.put(R.id.validateResult, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener passwordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of BiometricLoginViewModel.strPassword.get()
            //         is BiometricLoginViewModel.strPassword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(password);
            // localize variables for thread safety
            // BiometricLoginViewModel != null
            boolean biometricLoginViewModelJavaLangObjectNull = false;
            // BiometricLoginViewModel.strPassword != null
            boolean biometricLoginViewModelStrPasswordJavaLangObjectNull = false;
            // BiometricLoginViewModel.strPassword.get()
            java.lang.String biometricLoginViewModelStrPasswordGet = null;
            // BiometricLoginViewModel.strPassword
            androidx.databinding.ObservableField<java.lang.String> biometricLoginViewModelStrPassword = null;
            // BiometricLoginViewModel
            com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel biometricLoginViewModel = mBiometricLoginViewModel;



            biometricLoginViewModelJavaLangObjectNull = (biometricLoginViewModel) != (null);
            if (biometricLoginViewModelJavaLangObjectNull) {


                biometricLoginViewModelStrPassword = biometricLoginViewModel.getStrPassword();

                biometricLoginViewModelStrPasswordJavaLangObjectNull = (biometricLoginViewModelStrPassword) != (null);
                if (biometricLoginViewModelStrPasswordJavaLangObjectNull) {




                    biometricLoginViewModelStrPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of BiometricLoginViewModel.strUserName.get()
            //         is BiometricLoginViewModel.strUserName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // BiometricLoginViewModel != null
            boolean biometricLoginViewModelJavaLangObjectNull = false;
            // BiometricLoginViewModel
            com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel biometricLoginViewModel = mBiometricLoginViewModel;
            // BiometricLoginViewModel.strUserName
            androidx.databinding.ObservableField<java.lang.String> biometricLoginViewModelStrUserName = null;
            // BiometricLoginViewModel.strUserName != null
            boolean biometricLoginViewModelStrUserNameJavaLangObjectNull = false;
            // BiometricLoginViewModel.strUserName.get()
            java.lang.String biometricLoginViewModelStrUserNameGet = null;



            biometricLoginViewModelJavaLangObjectNull = (biometricLoginViewModel) != (null);
            if (biometricLoginViewModelJavaLangObjectNull) {


                biometricLoginViewModelStrUserName = biometricLoginViewModel.getStrUserName();

                biometricLoginViewModelStrUserNameJavaLangObjectNull = (biometricLoginViewModelStrUserName) != (null);
                if (biometricLoginViewModelStrUserNameJavaLangObjectNull) {




                    biometricLoginViewModelStrUserName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityBiometricLogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityBiometricLogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (androidx.appcompat.widget.SwitchCompat) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.container.setTag(null);
        this.password.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.BiometricLoginViewModel == variableId) {
            setBiometricLoginViewModel((com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBiometricLoginViewModel(@Nullable com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel BiometricLoginViewModel) {
        this.mBiometricLoginViewModel = BiometricLoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.BiometricLoginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBiometricLoginViewModelStrPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeBiometricLoginViewModelStrUserName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBiometricLoginViewModelStrPassword(androidx.databinding.ObservableField<java.lang.String> BiometricLoginViewModelStrPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBiometricLoginViewModelStrUserName(androidx.databinding.ObservableField<java.lang.String> BiometricLoginViewModelStrUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.databinding.ObservableField<java.lang.String> biometricLoginViewModelStrPassword = null;
        com.test.movies.uicomponents.ui.login.biometric.BiometricLoginViewModel biometricLoginViewModel = mBiometricLoginViewModel;
        androidx.databinding.ObservableField<java.lang.String> biometricLoginViewModelStrUserName = null;
        java.lang.String biometricLoginViewModelStrPasswordGet = null;
        java.lang.String biometricLoginViewModelStrUserNameGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (biometricLoginViewModel != null) {
                        // read BiometricLoginViewModel.strPassword
                        biometricLoginViewModelStrPassword = biometricLoginViewModel.getStrPassword();
                    }
                    updateRegistration(0, biometricLoginViewModelStrPassword);


                    if (biometricLoginViewModelStrPassword != null) {
                        // read BiometricLoginViewModel.strPassword.get()
                        biometricLoginViewModelStrPasswordGet = biometricLoginViewModelStrPassword.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (biometricLoginViewModel != null) {
                        // read BiometricLoginViewModel.strUserName
                        biometricLoginViewModelStrUserName = biometricLoginViewModel.getStrUserName();
                    }
                    updateRegistration(1, biometricLoginViewModelStrUserName);


                    if (biometricLoginViewModelStrUserName != null) {
                        // read BiometricLoginViewModel.strUserName.get()
                        biometricLoginViewModelStrUserNameGet = biometricLoginViewModelStrUserName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, biometricLoginViewModelStrPasswordGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.password, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, biometricLoginViewModelStrUserNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): BiometricLoginViewModel.strPassword
        flag 1 (0x2L): BiometricLoginViewModel.strUserName
        flag 2 (0x3L): BiometricLoginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}