package com.example.restaurantsapplication.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.restaurants.RestaurantsActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent intent = new Intent(SplashActivity.this, RestaurantsActivity.class);
        startActivity(intent);
    }
}