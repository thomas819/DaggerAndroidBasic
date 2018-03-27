package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;

import javax.inject.Inject;

/**
 * Created by thomas on 2018-03-26.
 */

public class MainPresenter implements MainContract.Presenter{

    MainContract.View view;

    @Inject
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }
}
