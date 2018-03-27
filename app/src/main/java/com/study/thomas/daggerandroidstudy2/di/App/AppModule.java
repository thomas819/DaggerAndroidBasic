package com.study.thomas.daggerandroidstudy2.di.App;

import android.app.Activity;

import com.study.thomas.daggerandroidstudy2.di.MainComponent;
import com.study.thomas.daggerandroidstudy2.di.SecondComponent;
import com.study.thomas.daggerandroidstudy2.mvp.View.MainActivity;
import com.study.thomas.daggerandroidstudy2.mvp.View.SecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by thomas on 2018-03-26.
 */
@Module(subcomponents = {MainComponent.class, SecondComponent.class})
public abstract class AppModule {


    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSecondActivity(SecondComponent.Builder builder);

}
