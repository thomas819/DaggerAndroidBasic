package com.study.thomas.daggerandroidstudy2.mvp.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.study.thomas.daggerandroidstudy2.R;
import com.study.thomas.daggerandroidstudy2.mvp.Contract.MainContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements MainContract.View, HasSupportFragmentInjector {

    @Inject DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject MainContract.Presenter presenter;
    @BindView(R.id.viewpager) ViewPager viewpager;
    @BindView(R.id.bottom_navi) BottomNavigationView bottomNavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        AndroidInjection.inject(this);
        presenter.getData();
        initBottomNavi();
    }


    public void initBottomNavi(){
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return Fragment1.newInstance();
                    case 1:
                        return Fragment1.newInstance();
                    case 2:
                        return Fragment1.newInstance();
                }
                return null;
            }
        });
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavi.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        bottomNavi.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navi1:
                    viewpager.setCurrentItem(0);
                    return true;
                case R.id.navi2:
                    viewpager.setCurrentItem(1);
                    return true;
                case R.id.navi3:
                    viewpager.setCurrentItem(2);
                    return true;
            }
            return true;
        });
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
