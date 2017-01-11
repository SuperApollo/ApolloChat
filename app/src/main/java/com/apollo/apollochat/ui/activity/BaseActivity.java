package com.apollo.apollochat.ui.activity;

import android.support.v4.app.FragmentActivity;
import android.view.ViewConfiguration;

import java.lang.reflect.Field;

/**
 * Created by zayh_yf20160909 on 2017/1/11.
 */

public class BaseActivity extends FragmentActivity {


    private void setOverflowShowingAlways() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            menuKeyField.setAccessible(true);
            menuKeyField.setBoolean(config, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
