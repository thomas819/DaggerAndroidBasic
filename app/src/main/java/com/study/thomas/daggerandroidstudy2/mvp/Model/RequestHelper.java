package com.study.thomas.daggerandroidstudy2.mvp.Model;

import retrofit2.Call;

/**
 * Created by thomas on 2018-03-28.
 */

public interface RequestHelper {
    Request initRetrofit(String url);
    Call retrofit1();
}
