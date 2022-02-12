package com.example.database;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class SharedPref {

    private static SharedPreferences mSharedPref;

    private SharedPref() {}

    public static void init(Context context)
    {
        if(mSharedPref == null)
            mSharedPref = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
    }

    public static String read(String key, String defValue) {
        return mSharedPref.getString(key, defValue);
    }

    public static void write(String key, User user) {
//        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
//        prefsEditor.putString(key, value);
//        prefsEditor.apply();
// -1 object To StringGson
        Gson gson=new Gson();
      // gson.toJson(user);
      String userJson=  gson.toJson(user);
        // اروح اخزنة في حاجه
        mSharedPref.edit().putString(key,userJson).apply();
    }
    // -2 String to Gson
    
    public static User read(String key) {
        String userJson= mSharedPref.getString(key, "");
        Gson gson=new Gson();
        // gson.toJson(user);
        User user =gson.fromJson( userJson,User.class);
        // اروح اخزنة في حاجه
        return user;
    }

    public static boolean read(String key, boolean defValue) {
        return mSharedPref.getBoolean(key, defValue);
    }

    public static void write(String key, boolean value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putBoolean(key, value);
        prefsEditor.apply();
    }

    public static Integer read(String key, int defValue) {
        return mSharedPref.getInt(key, defValue);
    }

    public static void write(String key, Integer value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putInt(key, value).apply();
    }


}
