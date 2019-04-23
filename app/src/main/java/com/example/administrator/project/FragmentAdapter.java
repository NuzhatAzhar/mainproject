package com.example.administrator.project;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments;

    public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tajweed";
            case 1:
                return "Learned";
            case 2:
                return "Our Venue";
                default:
                    return "";
        }
    }
}
