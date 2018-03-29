package com.study.thomas.daggerandroidstudy2.mvp.Model;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by thomas on 2018-03-28.
 */

public class RetrofitHelper implements RetrofitHelperInterface {

    private Retrofit retrofit;
    private Request request;
    private String url="http://jsonplaceholder.typicode.com";
    @Inject
    public RetrofitHelper() {
    }


    @Override
    public Request initRetrofit() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(Request.class);
    }

}
