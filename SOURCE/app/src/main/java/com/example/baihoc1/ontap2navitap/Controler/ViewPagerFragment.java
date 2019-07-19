package com.example.baihoc1.ontap2navitap.Controler;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baihoc1.ontap2navitap.Controler.Adapter.ViewPagerServiceAdapter;
import com.example.baihoc1.ontap2navitap.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragment extends Fragment {

    View vRoot;
    ViewPager vpServices;
    ArrayList<Fragment> data = new ArrayList<>();
    TabLayout tabtool;


    public ViewPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vRoot = inflater.inflate(R.layout.content_main, container, false);
        init();
        prepareViewPager();
        return vRoot;
    }

    private void prepareViewPager() {
        ViewPagerServiceAdapter viewPagerServiceAdapter =
                new ViewPagerServiceAdapter(getSupportFragmentManager(),
                        this,data);
        vpServices.setAdapter(viewPagerServiceAdapter);
        tabtool.setupWithViewPager(vpServices);
    }

    private void init() {
        vpServices = vRoot.findViewById(R.id.vp_services);
        tabtool = vRoot.findViewById(R.id.tb_tool);
        AllMaterial_Fragment allMaterial_fragment = new AllMaterial_Fragment();
        RecentMaterial_Fragment recentMaterial_fragment = new RecentMaterial_Fragment();
        data.add(allMaterial_fragment);
        data.add(recentMaterial_fragment);

    }

}
