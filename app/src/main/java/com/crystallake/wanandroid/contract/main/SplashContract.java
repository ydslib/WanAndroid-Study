package com.crystallake.wanandroid.contract.main;

import com.crystallake.wanandroid.mvp.presenter.AbstractPresenter;
import com.crystallake.wanandroid.mvp.view.AbstractView;

/**
 * Created by yds
 * on 2020/6/14.
 */
public interface SplashContract {
    interface View extends AbstractView{
        /**
         * 一定时间后跳转到主页面
         */
        void jumpToMain();
    }
    interface Presenter extends AbstractPresenter<View>{

    }
}
