package com.apollo.apollochat.ui.activity;

import android.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.apollo.apollochat.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by zayh_yf20160909 on 2017/1/12.
 */

public class LoginActivity extends BaseActivity {
    @BindView(R.id.et_login_username)
    EditText mEtUserName;
    @BindView(R.id.et_login_password)
    EditText mEtPassword;
    @BindView(R.id.cb_login_remember)
    CheckBox mCbRemember;
    @BindView(R.id.btn_login_register)
    Button mBtnRegister;
    @BindView(R.id.btn_login_login)
    Button mBtnLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected int getMenuLayoutId() {
        return -1;
    }

    @Override
    protected void initView() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /**
     * 绑定button的点击事件，button绑定的方法名自定
     *
     * @param v
     */
    @OnClick({R.id.btn_login_register, R.id.btn_login_login})
    public void doClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login_register:
                mToastUtils.show(this, "注册");
                break;
            case R.id.btn_login_login:
                mToastUtils.show(this, "登录");
                break;
        }
    }
}
