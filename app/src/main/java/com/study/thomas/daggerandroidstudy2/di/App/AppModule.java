package com.study.thomas.daggerandroidstudy2.di.App;

import android.app.Activity;
import android.app.Application;

import com.study.thomas.daggerandroidstudy2.App;
import com.study.thomas.daggerandroidstudy2.di.MainComponent;
import com.study.thomas.daggerandroidstudy2.di.SecondComponent;
import com.study.thomas.daggerandroidstudy2.mvp.Model.RetrofitHelperInterface;
import com.study.thomas.daggerandroidstudy2.mvp.Model.RetrofitHelper;
import com.study.thomas.daggerandroidstudy2.mvp.View.MainActivity;
import com.study.thomas.daggerandroidstudy2.mvp.View.SecondActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by thomas on 2018-03-26.
 */
@Module(subcomponents = {MainComponent.class, SecondComponent.class})
public abstract class AppModule {

    @Binds
    @Singleton
    abstract Application application(App app);

    @Singleton
    @Binds
    abstract RetrofitHelperInterface retrofitHelper(RetrofitHelper retrofitHelper);

    //    @Provides
//    @Named("unique_string_id")
//    static String provideName(){
//        return "I love Medium";
//    }

//    @Provides
//    @Singleton
//    static FirebaseDatabase provideFirebaseDatabase(){
//        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//        firebaseDatabase.setPersistenceEnabled(true);
//        return firebaseDatabase;
//    }
// Provides 쓰려면 static 붙여서 쓰라

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSecondActivity(SecondComponent.Builder builder);

}
