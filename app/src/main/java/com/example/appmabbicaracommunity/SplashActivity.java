package com.example.appmabbicaracommunity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final int Waktu_Loading = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                /* Create an Intent that will start the Menu-Activity. */
                Intent menu=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(menu);
                finish();

            }
        },Waktu_Loading);
    }
}