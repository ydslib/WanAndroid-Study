package com.crystallake.wanandroid.mvp.presenter;

import com.crystallake.wanandroid.mvp.view.AbstractView;

import io.reactivex.rxjava3.disposables.Disposable;

/**
 * Created by yds
 * on 2020/5/23.
 */
public interface AbstractPresenter<T extends AbstractView> {
    /**
     * 注入View
     */
    void attachView(T view);

    /**
     * 回收View
     */
    void detachView();

    /**
     * 获取夜晚模式状态
     */
    boolean getNightModeState();

    /**
     * 设置登陆状态
     */
    void setLoginStatus(boolean loginStatus);

    /**
     * 获取登陆状态
     */
    boolean getLoginStatus();

    /**
     * 获取登陆账号
     */
    String getLoginAccount();

    /**
     * 设置登陆账号
     */
    String setLoginAccount();

    /**
     * 设置登陆密码
     */
    void setLoginPassword(String password);

    /**
     * 获取当前页
     */
    int getCurrentPage();

    void addRxBindingSubscribe(Disposable disposable);
}
