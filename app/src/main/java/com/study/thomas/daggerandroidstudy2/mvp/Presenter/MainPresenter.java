package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;
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
 * Created by thomas on 2018-03-26.
 */

public class MainPresenter implements MainContract.Presenter{

    MainContract.View view;
    RetrofitHelper retrofitHelper;

    @Inject
    public MainPresenter(MainContract.View view, RetrofitHelper retrofitHelper) {
        this.view = view;
        this.retrofitHelper = retrofitHelper;
    }

    @Override
    public void getData(){
        Observable<List<Request.Repository>> observable = retrofitHelper.initRetrofit().repo1(1,"comments");
        CompositeDisposable mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(observable.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<List<Request.Repository>>() {
                    @Override
                    public void onNext(List<Request.Repository> repositories) {
                        for(Request.Repository repositories1 : repositories)
                        view.showTv(repositories1.getEmail());
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
