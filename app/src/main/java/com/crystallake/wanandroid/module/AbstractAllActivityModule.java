package com.crystallake.wanandroid.module;

import com.crystallake.wanandroid.MainActivity;
import com.crystallake.wanandroid.activity.SplashActivity;
import com.crystallake.wanandroid.component.BaseActivityComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by yds
 * on 2020/5/23.
 */
@Module(subcomponents = {BaseActivityComponent.class})
public abstract class AbstractAllActivityModule {
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributesMainActivityInjector();

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity contributesSplashActivityInjector();
}
