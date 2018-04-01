package com.study.thomas.daggerandroidstudy2.mvp.Contract;

/**
 * Created by thomas on 2018-04-01.
 */

public interface Fragment1Contract {
    interface View{

        void showText(String txt);
    }
    interface Presenter{

        void getData();
    }
}
