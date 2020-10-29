package com.example.restaurantsapplication.server;

import com.example.restaurantsapplication.model.RestaurantItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {
    @GET("/restaurant/list")
    Call<List<RestaurantItem>> getRestaurants();
}
