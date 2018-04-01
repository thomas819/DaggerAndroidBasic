package com.study.thomas.daggerandroidstudy2.mvp.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.study.thomas.daggerandroidstudy2.R;
import com.study.thomas.daggerandroidstudy2.di.Fragment2Component;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.Fragment2Contract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment implements Fragment2Contract.view {

    @Inject Fragment2Contract.Presenter presenter;
    @BindView(R.id.fragment2Tv)
    TextView fragment2Tv;
    Unbinder unbinder;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
