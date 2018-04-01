package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment1Contract;
import com.study.thomas.daggerandroidstudy2.mvp.Model.Request;
import com.study.thomas.daggerandroidstudy2.mvp.Model.RetrofitHelper;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by thomas on 2018-04-01.
 */

public class Fragment1Presenter implements Fragment1Contract.Presenter{

    Fragment1Contract.View view;
    RetrofitHelper retrofitHelper;

    @Inject
    public Fragment1Presenter(Fragment1Contract.View view, RetrofitHelper retrofitHelper) {
        this.view = view;
        this.retrofitHelper = retrofitHelper;
    }

    @Override
    public void getData(){
        Observable<List<Request.Repository>> observable = retrofitHelper.initRetrofit().repo1(1,"comments");

        new CompositeDisposable().add(observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<List<Request.Repository>>() {
                    @Override
                    public void onNext(List<Request.Repository> repositories) {
                        for(Request.Repository repositories1 : repositories){
                            view.showText(repositories1.getEmail());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                })
        );
    }
}
