package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.ActivityScope;
import com.study.thomas.daggerandroidstudy2.mvp.View.SecondActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by thomas on 2018-03-26.
 */
@ActivityScope
@Subcomponent(modules = SecondModule.class)
public interface SecondComponent extends AndroidInjector<SecondActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity>{}
}
