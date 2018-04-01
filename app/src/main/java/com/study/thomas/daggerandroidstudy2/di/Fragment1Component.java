package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.FragmentScope;
import com.study.thomas.daggerandroidstudy2.mvp.View.Fragment1;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by thomas on 2018-04-01.
 */

@FragmentScope
@Subcomponent(modules = Fragment1Module.class)
public interface Fragment1Component extends AndroidInjector<Fragment1>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Fragment1>{}
}
