package com.example.baihoc1.imoto.Controler.Util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig  {
    public static final String PREF_NAME = "IMoto";

    // --------------------------------------------------
    public static void setPhoneNumber(String phoneNumber, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("PhoneUser", phoneNumber);
        editor.apply();
    }

    public static void setTenUser(String tenUser, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("tenUser", tenUser);
        editor.apply();
    }

    public static void setBiensoUser(String biensoUser, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("biensoUser", biensoUser);
        editor.apply();
    }

    //------------------------------------------------
    public static String getPhoneNumber(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("PhoneUser", null);
    }

    public static String getTenUser(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("tenUser", null);
    }

    public static String getBiensoUser(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("biensoUser", null);
    }


}
