package com.example.baihoc1.ontap2navitap.Controler.Adapter;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
        return 0;
    }
}
