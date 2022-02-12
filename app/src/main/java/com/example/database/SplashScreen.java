package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPref.init(getApplicationContext());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                    //get
//                    SharedPreferences sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
                   // boolean rememberMe = sharedPreferences.getBoolean("rememberMe", false);

                    boolean rememberMe =  SharedPref.read("rememberMe",false);
                    Intent intent;
                    if (rememberMe) {
                        intent = new Intent(SplashScreen.this, MainActivity.class);
                    } else {
                        intent = new Intent(SplashScreen.this, LoginScreen.class);
                    }
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    thread.start();

    }
}