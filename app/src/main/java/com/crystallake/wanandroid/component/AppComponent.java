package com.crystallake.wanandroid.component;

import com.crystallake.wanandroid.app.WanAndroidApp;
import com.crystallake.wanandroid.manager.DataManager;
import com.crystallake.wanandroid.module.AbstractAllActivityModule;
import com.crystallake.wanandroid.module.AbstractAllFragmentModule;
import com.crystallake.wanandroid.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by yds
 * on 2020/5/23.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AbstractAllActivityModule.class,
        AbstractAllFragmentModule.class,
        AppModule.class
})
public interface AppComponent {
    /**
     * 注入WanAndroidApp实例
     *
     * @param wanAndroidApp WanAndroidApp
     */
    void inject(WanAndroidApp wanAndroidApp);

    /**
     * 提供App的Context
     *
     * @return GeeksApp context
     */
    WanAndroidApp getContext();

//    DataManager

    DataManager getDataManager();
}
