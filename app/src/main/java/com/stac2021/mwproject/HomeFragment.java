package com.stac2021.mwproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.Timer;

public class HomeFragment extends Fragment {

    int i = 0;
    TabLayout tabLayout;
    ViewPager viewPager;
    FragmentAdapter adapter;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private BannerAdapter bannerAdapter;
    public HomeFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)  {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        tabLayout = (TabLayout)view.findViewById(R.id.tabLayout);
        viewPager = (ViewPager)view.findViewById(R.id.viewPager);
        adapter = new FragmentAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter); //뷰페이지와 어댑터 연결
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("통합 정보"); //탭이름생성
        tabLayout.getTabAt(1).setText("여성 정보");
        tabLayout.getTabAt(2).setText("생활 정보");
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }
}