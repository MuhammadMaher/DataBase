package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class LoginScreen extends AppCompatActivity {
    CheckBox checkBox;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        button=findViewById(R.id.button);
        checkBox=findViewById(R.id.checkbox_ch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remember(checkBox.isChecked());
            }
        });

    }

    private void remember(boolean Remember){
        //put
//        SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
//        sharedPreferences.edit().putBoolean("rememberMe",Remember).apply();
            SharedPref.write("rememberMe",Remember);
    }
}