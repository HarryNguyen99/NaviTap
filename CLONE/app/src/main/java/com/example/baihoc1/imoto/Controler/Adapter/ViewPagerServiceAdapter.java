package com.example.baihoc1.imoto.Controler.Adapter;


import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class ViewPagerServiceAdapter extends FragmentPagerAdapter {

    Context context;
    ArrayList<Fragment> data;

    public ViewPagerServiceAdapter(FragmentManager fm, Context context, ArrayList<Fragment> data) {
        super(fm);
        this.context = context;
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "AllMaterial";
            case 1:
                return "RecentMaterial";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
