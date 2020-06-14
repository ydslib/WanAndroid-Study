package com.crystallake.wanandroid.module;

import com.crystallake.wanandroid.app.WanAndroidApp;
import com.crystallake.wanandroid.manager.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yds
 * on 2020/5/23.
 */
@Module
public class AppModule {
    private final WanAndroidApp application;

    public AppModule(WanAndroidApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    WanAndroidApp provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(){
        return new DataManager();
    }
}
