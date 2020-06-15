package com.crystallake.wanandroid;


import com.crystallake.wanandroid.activity.BaseActivity;
import com.crystallake.wanandroid.contract.main.MainContract;
import com.crystallake.wanandroid.mvp.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar() {
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    public void showSwitchProject() {

    }

    @Override
    public void showSwitchNavigation() {

    }

    @Override
    public void showAutoLoginView() {

    }

    @Override
    public void showLogoutSuccess() {

    }
}
