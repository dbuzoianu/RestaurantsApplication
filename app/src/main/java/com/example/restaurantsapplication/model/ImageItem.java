package com.example.restaurantsapplication.model;

import com.google.gson.annotations.SerializedName;

public class ImageItem {
    private int icon;

    @SerializedName("imagePath")
    private String imagePath;

    public ImageItem(int icon, String imagePath) {
        this.icon = icon;
        this.imagePath = imagePath;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
