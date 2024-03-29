package com.example.baihoc1.imoto.Controler;

import android.os.Bundle;

import com.example.baihoc1.imoto.Controler.Adapter.ViewPagerServiceAdapter;
import com.example.baihoc1.imoto.Controler.Util.AppConfig;
import com.example.baihoc1.imoto.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TabLayout tlTool;
    ViewPager vpServices;
    ArrayList<Fragment> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        init();
        setDataNavigation();
        configVP();
    }

    private void configVP() {
        AllMaterial_Fragment allMaterial_fragment = new AllMaterial_Fragment();
        RecentMaterial_Fragment recentMaterial_fragment = new RecentMaterial_Fragment();
        data.add(allMaterial_fragment);
        data.add(recentMaterial_fragment);
        ViewPagerServiceAdapter viewPagerServiceAdapter =
                new ViewPagerServiceAdapter(getSupportFragmentManager(),
                        this,data);
        vpServices.setAdapter(viewPagerServiceAdapter);
        tlTool.setupWithViewPager(vpServices);

    }

    private void setDataNavigation() {

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        TextView tenUser = (TextView) headerView.findViewById(R.id.tv_ten_user);
        TextView phoneUser = (TextView) headerView.findViewById(R.id.tv_sdt);
        TextView biensoUser = (TextView) headerView.findViewById(R.id.tv_bien_so);
        //---
        String strPhoneUser = AppConfig.getPhoneNumber(MainActivity.this);
        String strTenUser = AppConfig.getTenUser(MainActivity.this);
        String strBiensoUser = AppConfig.getBiensoUser(MainActivity.this);
        tenUser.setText(strTenUser);
        phoneUser.setText(strPhoneUser);
        biensoUser.setText(strBiensoUser);


    }

    private void init() {
        vpServices = findViewById(R.id.vp_services);
        tlTool = findViewById(R.id.tl_tool);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_phu_tung) {


        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
