package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;
import com.study.thomas.daggerandroidstudy2.mvp.Model.RetrofitHelper;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    public void ba(){
        retrofitHelper.initRetrofit("").repo1(1).enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {

            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }
        });
    }
}
