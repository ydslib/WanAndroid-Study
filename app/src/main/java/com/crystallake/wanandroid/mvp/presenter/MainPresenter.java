package com.crystallake.wanandroid.mvp.presenter;

import com.crystallake.wanandroid.MainActivity;
import com.crystallake.wanandroid.contract.main.MainContract;
import com.crystallake.wanandroid.manager.DataManager;

import javax.inject.Inject;

/**
 * Created by yds
 * on 2020/6/13.
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private DataManager mDataManager;

    @Inject
    MainPresenter(DataManager dataManager) {
        super(dataManager);
        this.mDataManager = dataManager;
    }

    @Override
    public void setCurrentPage(int page) {

    }

    @Override
    public void setNightModeState(boolean b) {

    }

    @Override
    public void logout() {

    }
}
