package com.crystallake.wanandroid.component;

import com.crystallake.wanandroid.fragment.BaseFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by yds
 * on 2020/6/7.
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseFragmentComponent extends AndroidInjector<BaseFragment> {
    @Subcomponent.Builder
    abstract class BaseBuilder extends AndroidInjector.Builder<BaseFragment> {

    }
}
