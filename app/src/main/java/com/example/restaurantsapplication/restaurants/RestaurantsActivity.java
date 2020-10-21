package com.example.restaurantsapplication.restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.restaurantsapplication.R;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.item_restaurant_constraint_layout);
    }
}