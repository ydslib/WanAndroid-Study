package com.crystallake.wanandroid.mvp.view;

/**
 * Created by yds
 * on 2020/5/23.
 */
public interface AbstractView {
    /**
     * 夜晚模式
     */
    void useNightMode(boolean isNightMode);
    /**
     * 展示错误信息
     */
    void showErrorMsg(String errorMsg);
    /**
     * 显示普通信息
     */
    void showNormal();
    /**
     * 显示错误
     */
    void showError();
    /**
     * 显示加载
     */
    void showLoading();
    /**
     * 重新加载
     */
    void reload();
    /**
     * 显示登陆视图
     */
    void showLoginView();
    /**
     * 显示登出视图
     */
    void showLogoutView();
    /**
     * 显示收集成功
     */
    void showCollectSuccess();
    /**
     * 显示收集取消成功
     */
    void showCancelCollectSuccess();
    /**
     * Show snackBar
     *
     * @param message Message
     */
    void showSnackBar(String message);
}
