package com.apollo.apollochat.ui;

import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

import com.apollo.apollochat.R;
import com.apollo.apollochat.ui.utils.ToastUtils;

/**
 * Created by zayh_yf20160909 on 2017/1/12.
 */

public class PlusActionProvider extends ActionProvider {
    private Context context;

    /**
     * Creates a new instance.
     *
     * @param context Context for accessing resources.
     */
    public PlusActionProvider(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public View onCreateActionView() {
        return null;
    }

    @Override
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        subMenu.add(context.getString(R.string.plus_one))
                .setIcon(R.mipmap.ic_launcher)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        ToastUtils.shareInstance().show(context, "加一");
                        return true;
                    }
                });
        subMenu.add(context.getString(R.string.plus_two))
                .setIcon(R.mipmap.ic_launcher)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        ToastUtils.shareInstance().show(context, "加二");
                        return true;
                    }
                });
        subMenu.add(context.getString(R.string.plus_three))
                .setIcon(R.mipmap.ic_launcher)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        ToastUtils.shareInstance().show(context, "加三");
                        return true;
                    }
                });

    }

    @Override
    public boolean hasSubMenu() {
        return true;
    }
}
