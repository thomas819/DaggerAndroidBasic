package com.study.thomas.daggerandroidstudy2.di.App;

import com.study.thomas.daggerandroidstudy2.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by thomas on 2018-03-26.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,AppModule.class})
public interface AppComponent {
    void inject(Application application);
}
