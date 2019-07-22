package com.example.baihoc1.imoto.Controler;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baihoc1.imoto.Controler.Util.AppConfig;
import com.example.baihoc1.imoto.R;


public class SplashActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        slash();

    }

    private void slash() {
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String phone = AppConfig.getPhoneNumber(SplashActivity.this);

                if (phone == null) {
                    Intent intentlogin = new Intent(SplashActivity.this, Login_Activity.class);
                    startActivity(intentlogin);
                    finish();
                } else {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },999999999);
    }
}
