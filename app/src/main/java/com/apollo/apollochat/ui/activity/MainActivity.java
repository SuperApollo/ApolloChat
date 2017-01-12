package com.apollo.apollochat.ui.activity;

import android.view.MenuItem;

import com.apollo.apollochat.R;
import com.apollo.apollochat.ui.utils.IntentUtils;

public class MainActivity extends BaseActivity {
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
                IntentUtils.sendIntent(MainActivity.this, LoginActivity.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getMenuLayoutId() {
        return R.menu.main;
    }

    @Override
    protected void initView() {

    }
}
