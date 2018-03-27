package com.study.thomas.daggerandroidstudy2.mvp.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by thomas on 2018-03-28.
 */

public interface Request {
    @GET("dd")
    Call<List<String>> repo1(@Query("postId") int posId);
}
