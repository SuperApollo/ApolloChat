package com.apollo.apollochat.ui.activity;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.view.MenuItem;

import com.apollo.apollochat.R;
import com.apollo.apollochat.ui.utils.IntentUtils;

public class MainActivity extends BaseActivity {

    private ActionBar mActionBar;

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
        mActionBar = getActionBar();
        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab = mActionBar.newTab()
                .setText(R.string.tab_message)
                .setTabListener(new ActionBar.TabListener() {
                    @Override
                    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                        mToastUtils.show(MainActivity.this,"信息");
                    }

                    @Override
                    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                    }

                    @Override
                    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                    }
                });
        mActionBar.addTab(tab);
        tab = mActionBar.newTab()
                .setText(R.string.tab_contacts)
                .setTabListener(new ActionBar.TabListener() {
                    @Override
                    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                        mToastUtils.show(MainActivity.this,"联系人");
                    }

                    @Override
                    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                    }

                    @Override
                    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                    }
                });
        mActionBar.addTab(tab);

    }
}
