package com.example.restaurantsapplication.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.RestaurantItem;
import com.example.restaurantsapplication.server.ServerProvider;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantsActivity extends AppCompatActivity {

    List<RestaurantItem> restaurantsList = new ArrayList<>();
    RestaurantItemAdapter restaurantsAdapter;
    RecyclerView restaurantsListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants_list_layout);

        restaurantsListView = findViewById(R.id.restaurantsListView);
        restaurantsListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        restaurantsListView.setHasFixedSize(true);

        restaurantsAdapter = new RestaurantItemAdapter();

        getRestaurantsAsynchronous();
    }

    private void getRestaurantsAsynchronous() {
        ServerProvider.createPostService().getRestaurants().enqueue(new Callback<List<RestaurantItem>>() {
            @Override
            public void onResponse(Call<List<RestaurantItem>> call, Response<List<RestaurantItem>> response) {
                if (response.isSuccessful()) {
                    restaurantsList = response.body();

                    if(!restaurantsList.isEmpty()) {
                        restaurantsAdapter.setData(restaurantsList, getBaseContext());
                        restaurantsListView.setAdapter(restaurantsAdapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<RestaurantItem>> call, Throwable t) {

            }
        });
    }




}