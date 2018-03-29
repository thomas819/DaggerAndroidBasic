package com.study.thomas.daggerandroidstudy2.mvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.study.thomas.daggerandroidstudy2.R;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject MainContract.Presenter presenter;
    @BindView(R.id.mainTv) TextView mainTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        AndroidInjection.inject(this);
        presenter.getData();
    }
    @Override
    public void showTv(String data){
        mainTv.setText(data);
    }
}
