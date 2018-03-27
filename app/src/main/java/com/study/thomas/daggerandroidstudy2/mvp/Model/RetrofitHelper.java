package com.study.thomas.daggerandroidstudy2.mvp.Model;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by thomas on 2018-03-28.
 */

public class RetrofitHelper implements RequestHelper{

    private Retrofit retrofit;
    private Request request;
    @Inject
    public RetrofitHelper() {
    }


    @Override
    public Request initRetrofit(String url) {
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return request=retrofit.create(Request.class);
    }

    @Override
    public Call retrofit1(){
        Call<List<String>> call = initRetrofit("").repo1(1);
        return call;
    }
}
