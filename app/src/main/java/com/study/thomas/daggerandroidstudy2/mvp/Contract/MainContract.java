package com.study.thomas.daggerandroidstudy2.mvp.Contract;

/**
 * Created by thomas on 2018-03-26.
 */

public interface MainContract {
    interface View{

        void showTv(String data);
    }
    interface Presenter{

        void getData();
    }
}
