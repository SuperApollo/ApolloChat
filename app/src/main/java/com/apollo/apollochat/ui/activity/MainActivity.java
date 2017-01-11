package com.apollo.apollochat.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import com.apollo.apollochat.R;
import com.apollo.apollochat.ui.utils.ToastUtils;

import java.lang.reflect.Field;

public class MainActivity extends Activity {

    private ToastUtils mToastUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOverflowShowingAlways();
        initView();
    }

    private void initView() {
        mToastUtils = ToastUtils.shareInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                mToastUtils.show(this, "搜索");
                return true;
            case R.id.action_plus:
                mToastUtils.show(this, "添加");
                return true;
            case R.id.action_setting:
                mToastUtils.show(this, "设置");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * 使overflowbutton始终显示
     */
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
