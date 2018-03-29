package com.study.thomas.daggerandroidstudy2.di;

import com.study.thomas.daggerandroidstudy2.di.Scope.ActivityScope;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;
import com.study.thomas.daggerandroidstudy2.mvp.Presenter.MainPresenter;
import com.study.thomas.daggerandroidstudy2.mvp.View.MainActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by thomas on 2018-03-26.
 */
@Module
public abstract class MainModule{

    @ActivityScope
    @Binds
    abstract MainContract.View bindView(MainActivity activity);

    @ActivityScope
    @Binds
    abstract MainContract.Presenter bindPresenter(MainPresenter presenter);
}
