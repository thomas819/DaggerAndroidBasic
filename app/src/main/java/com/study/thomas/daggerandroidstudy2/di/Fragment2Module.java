package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.FragmentScope;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment2Contract;
import com.study.thomas.daggerandroidstudy2.mvp.Presenter.Fragment2Presenter;
import com.study.thomas.daggerandroidstudy2.mvp.View.Fragment2;

import dagger.Binds;
import dagger.Module;

/**
 * Created by thomas on 2018-04-01.
 */
@Module
public abstract class Fragment2Module {

    @FragmentScope
    @Binds
    abstract Fragment2Contract.view bindView(Fragment2 fragment);

    @FragmentScope
    @Binds
    abstract Fragment2Contract.Presenter bindPresenter(Fragment2Presenter presenter);

}
