package com.example.restaurantsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantsapplication.model.ImageItem;
import com.example.restaurantsapplication.model.RestaurantItem;

import java.util.ArrayList;

public class SingleRestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_restaurant_page);

        RecyclerView restaurantsListView = findViewById(R.id.restaurantsListView);
        restaurantsListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        restaurantsListView.setHasFixedSize(true);

        ImageItemAdapter restaurantsAdapter = new ImageItemAdapter(getMonkImages(), getBaseContext());
    }

    private ArrayList<ImageItem> getMonkImages() {
        ArrayList<ImageItem> restaurants = new ArrayList<>();

        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_btn_borderless_material));
        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha));
        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_scrubber_control_to_pressed_mtrl_000));
        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light));
        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_textfield_search_material));
        restaurants.add(new ImageItem(androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult));

        return restaurants;
    }
}