package com.example.restaurantsapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RestaurantItem {
    private int icon;
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

//    @SerializedName("photos")
//    private ArrayList<String> photos;

    public RestaurantItem(int icon, String name, String description, String imagePath, String latitude, String longitude, ArrayList<String> photos) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.latitude = latitude;
        this.longitude = longitude;
//        this.photos = photos;
    }

    public RestaurantItem(String name, String description, String imagePath, String latitude, String longitude, ArrayList<String> photos) {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.latitude = latitude;
        this.longitude = longitude;
//        this.photos = photos;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

//    public ArrayList<String> getPhotos() {
//        return photos;
//    }

//    public void setPhotos(ArrayList<String> photos) {
//        this.photos = photos;
//    }
}
