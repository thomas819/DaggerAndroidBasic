package com.study.thomas.daggerandroidstudy2.mvp.Presenter;

import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment2Contract;

import javax.inject.Inject;

/**
 * Created by thomas on 2018-04-01.
 */

public class Fragment2Presenter implements Fragment2Contract.Presenter{
    Fragment2Contract.view view;

    @Inject
    public Fragment2Presenter(Fragment2Contract.view view) {
        this.view = view;
    }
}
