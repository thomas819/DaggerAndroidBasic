package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.ActivityScope;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.SecondContract;
import com.study.thomas.daggerandroidstudy2.mvp.Presenter.SecondPresenter;
import com.study.thomas.daggerandroidstudy2.mvp.View.SecondActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by thomas on 2018-03-26.
 */
@Module
public abstract class SecondModule {


    @ActivityScope
    @Binds
    abstract SecondContract.View bindView(SecondActivity activity);

    @ActivityScope
    @Binds
    abstract SecondContract.Presenter bindPresenter(SecondPresenter presenter);


}
