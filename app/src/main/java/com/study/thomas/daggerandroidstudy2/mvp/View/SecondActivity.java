package com.study.thomas.daggerandroidstudy2.mvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.thomas.daggerandroidstudy2.R;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.SecondContract;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class SecondActivity extends AppCompatActivity implements SecondContract.View{

    @Inject SecondContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        AndroidInjection.inject(this);
    }
}
