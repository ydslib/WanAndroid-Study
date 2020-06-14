package com.crystallake.wanandroid.app;

import android.app.Activity;
import android.app.Application;

import com.crystallake.wanandroid.component.AppComponent;
import com.crystallake.wanandroid.component.DaggerAppComponent;
import com.crystallake.wanandroid.module.AppModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by yds
 * on 2020/5/19.
 */
public class WanAndroidApp extends Application implements HasActivityInjector {
    private static final String TAG = "[WanAndroidApp]";
    private static WanAndroidApp instance;
    private static volatile AppComponent appComponent;

    @Inject
    DispatchingAndroidInjector<Activity> mAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mAndroidInjector;
    }

    public static synchronized WanAndroidApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(instance))
                .build();
        appComponent.inject(this);
    }
}
