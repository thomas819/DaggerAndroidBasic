package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.FragmentScope;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment1Contract;
import com.study.thomas.daggerandroidstudy2.mvp.Presenter.Fragment1Presenter;
import com.study.thomas.daggerandroidstudy2.mvp.View.Fragment1;

import dagger.Binds;
import dagger.Module;

/**
 * Created by thomas on 2018-04-01.
 */
@Module
public abstract class Fragment1Module {

    @FragmentScope
    @Binds
    abstract Fragment1Contract.View bindView(Fragment1 fragment);

    @FragmentScope
    @Binds
    abstract Fragment1Contract.Presenter bindPresenter(Fragment1Presenter presenter);

}
