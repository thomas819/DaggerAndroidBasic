package com.study.thomas.daggerandroidstudy2.mvp.View;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.study.thomas.daggerandroidstudy2.R;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment1Contract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements Fragment1Contract.View {

    @Inject
    Fragment1Contract.Presenter presenter;
    @BindView(R.id.fragment1Tv) TextView fragment1Tv;
    Unbinder unbinder;

    public Fragment1() {
        // Required empty public constructor
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        unbinder = ButterKnife.bind(this, v);
        presenter.getData();
        return v;
    }

    @Override
    public void showText(String txt){
        fragment1Tv.setText(txt);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
