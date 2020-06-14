package com.crystallake.wanandroid.contract.main;

import com.crystallake.wanandroid.mvp.presenter.AbstractPresenter;
import com.crystallake.wanandroid.mvp.view.AbstractView;

/**
 * Created by yds
 * on 2020/6/13.
 */
public interface MainContract {
    interface View extends AbstractView{
        /**
         * Show switch project
         */
        void showSwitchProject();

        /**
         * Show switch navigation
         */
        void showSwitchNavigation();

        /**
         * Show auto login view
         */
        void showAutoLoginView();

        /**
         * Show logout success
         */
        void showLogoutSuccess();
    }
    interface Presenter extends AbstractPresenter<View> {

        /**
         * Set current page
         *
         * @param page current page
         */
        void setCurrentPage(int page);

        /**
         * Set night mode state
         *
         * @param b current night mode state
         */
        void setNightModeState(boolean b);

        /**
         * logout
         */
        void logout();
    }
}
