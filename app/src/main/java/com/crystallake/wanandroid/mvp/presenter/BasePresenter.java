package com.crystallake.wanandroid.mvp.presenter;

import com.crystallake.wanandroid.manager.DataManager;
import com.crystallake.wanandroid.mvp.view.AbstractView;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * Created by yds
 * on 2020/6/13.
 */
public class BasePresenter<T extends AbstractView> implements AbstractPresenter<T> {
    protected T mView;
    private DataManager mDataManager;

    public BasePresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;

    }

    @Override
    public boolean getNightModeState() {
        return false;
    }

    @Override
    public void setLoginStatus(boolean loginStatus) {

    }

    @Override
    public boolean getLoginStatus() {
        return false;
    }

    @Override
    public String getLoginAccount() {
        return null;
    }

    @Override
    public String setLoginAccount() {
        return null;
    }

    @Override
    public void setLoginPassword(String password) {

    }

    @Override
    public int getCurrentPage() {
        return 0;
    }

    @Override
    public void addRxBindingSubscribe(Disposable disposable) {

    }
}
