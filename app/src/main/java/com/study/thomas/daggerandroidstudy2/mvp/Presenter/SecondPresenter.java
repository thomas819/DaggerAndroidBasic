package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.SecondContract;

import javax.inject.Inject;

/**
 * Created by thomas on 2018-03-26.
 */

public class SecondPresenter implements SecondContract.Presenter{

    SecondContract.View view;

    @Inject
    public SecondPresenter(SecondContract.View view) {
        this.view = view;
    }
}
