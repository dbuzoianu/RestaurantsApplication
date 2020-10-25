package com.example.restaurantsapplication.restaurantsDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.ImageItem;

import java.util.ArrayList;

public class RestaurantDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_restaurant_page);

        RecyclerView imagesListView = findViewById(R.id.carouselRestaurant);
        imagesListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        imagesListView.setHasFixedSize(true);

        ImageItemAdapter imageAdapter = new ImageItemAdapter(getMonkImages(), getBaseContext());
        imagesListView.setAdapter(imageAdapter);
    }

    private ArrayList<ImageItem> getMonkImages() {
        ArrayList<ImageItem> images = new ArrayList<>();

        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_btn_borderless_material));
        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha));
        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_scrubber_control_to_pressed_mtrl_000));
        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light));
        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_textfield_search_material));
        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult));

        return images;
    }
}