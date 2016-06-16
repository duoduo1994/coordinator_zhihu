package com.wyl.mytextlayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;

import java.util.ArrayList;

import fragment.Fragments;

public class Main2Activity extends AppCompatActivity {
    private ViewPager vp;
    private TabLayout tab;
    private String[] titles= new String[]{"title 1","title 2","title 3"};
    private ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        initView();
        initData();
        setAdapter();

        tab.setupWithViewPager(vp);
    }

    private void setAdapter() {
        vp.setAdapter(new MyAdapter(getSupportFragmentManager()));

    }

    private void initData() {
        for (int i = 0; i <3 ; i++) {
            list.add(new Fragments());
        }

    }

    private void initView() {
        vp= (ViewPager) findViewById(R.id.vp);
        tab= (TabLayout) findViewById(R.id.tab);
    }
    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list==null?0:list.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
