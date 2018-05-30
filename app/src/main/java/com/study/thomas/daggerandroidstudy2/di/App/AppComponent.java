package com.study.thomas.daggerandroidstudy2.di.App;

import com.study.thomas.daggerandroidstudy2.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by thomas on 2018-03-26.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,AppModule.class})
public interface AppComponent extends AndroidInjector<App>{
    void inject(App app);

    //Application 가져오기  https://github.com/google/dagger/issues/832
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App>{}
}
