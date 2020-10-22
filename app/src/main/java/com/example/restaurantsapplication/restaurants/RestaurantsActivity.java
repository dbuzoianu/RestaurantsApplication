package com.example.restaurantsapplication.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.RestaurantItemAdapter;
import com.example.restaurantsapplication.model.RestaurantItem;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants_list_layout);
//        setContentView(R.layout.item_restaurant_constraint_layout);

        RecyclerView restaurantsListView = findViewById(R.id.restaurantsListView);
        restaurantsListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        restaurantsListView.setHasFixedSize(true);

        RestaurantItemAdapter restaurantsAdapter = new RestaurantItemAdapter(getMonkRestaurants(), getBaseContext());
        restaurantsListView.setAdapter(restaurantsAdapter);
    }

    private ArrayList<RestaurantItem> getMonkRestaurants() {
        ArrayList<RestaurantItem> restaurants = new ArrayList<>();

        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_btn_borderless_material, "Titlu1", "Desc1"));
        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, "Titlu2", "Desc2"));
        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_scrubber_control_to_pressed_mtrl_000, "Titlu3", "Desc3"));
        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light, "Titlu4", "Desc4"));
        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_textfield_search_material, "Titlu5", "Desc5"));
        restaurants.add(new RestaurantItem(androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult, "Titlu6", "Desc6"));

        return restaurants;
    }
}