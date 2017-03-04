package com.apollo.apollochat.ui.activity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.apollo.apollochat.R;

import java.lang.ref.WeakReference;

/**
 * Created by Apollo on 2017/3/4 15:50
 */

public class WelcomeActivity extends BaseActivity {
    private static final int FINISH_CURRENT = 0x00001;
    MyHandler mHandler = new MyHandler(this) {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case FINISH_CURRENT:
                    Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                    startActivity(intent);
                    WelcomeActivity.this.finish();
                    break;
            }
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected int getMenuLayoutId() {
        return -1;
    }

    @Override
    protected void initView() {
        Log.i("121212","ddddddddddd");
        mHandler.sendEmptyMessageDelayed(FINISH_CURRENT, 3000);
    }

    /**
     * 非静态内部类和匿名内部类会持有外部类的强引用，造成内存泄漏
     * 为避免handler内存泄漏，定义为静态内部类，并且使用WeakReference
     * 包裹传入的Activity对象
     */
    private static class MyHandler extends Handler {
        private final WeakReference<WelcomeActivity> mActivity;

        private MyHandler(WelcomeActivity mActivity) {
            this.mActivity = new WeakReference<>(mActivity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    }
}
