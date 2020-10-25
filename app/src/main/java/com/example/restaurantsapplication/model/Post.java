package com.example.restaurantsapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Post {
    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("imagePath")
    private String imagePath;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("photos")
    private ArrayList<String> photos;
}
