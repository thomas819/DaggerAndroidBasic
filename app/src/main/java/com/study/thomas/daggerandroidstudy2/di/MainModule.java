package com.study.thomas.daggerandroidstudy2.di;

import android.support.v4.app.Fragment;

import com.study.thomas.daggerandroidstudy2.di.Scope.ActivityScope;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;
import com.study.thomas.daggerandroidstudy2.mvp.Presenter.MainPresenter;
import com.study.thomas.daggerandroidstudy2.mvp.View.Fragment1;
import com.study.thomas.daggerandroidstudy2.mvp.View.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by thomas on 2018-03-26.
 */
@Module(subcomponents = Fragment1Compoenet.class)
public abstract class MainModule{

    @ActivityScope
    @Binds
    abstract MainContract.View bindView(MainActivity activity);

    @ActivityScope
    @Binds
    abstract MainContract.Presenter bindPresenter(MainPresenter presenter);

    @Binds
    @IntoMap
    @FragmentKey(Fragment1.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFragment1(Fragment1Compoenet.Builder builder);
}
