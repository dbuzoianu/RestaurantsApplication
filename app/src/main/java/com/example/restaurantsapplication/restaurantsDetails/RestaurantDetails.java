package com.example.restaurantsapplication.restaurantsDetails;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.ImageItem;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class RestaurantDetails extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_restaurant_page);

        setToolbar();

        RecyclerView imagesListView = findViewById(R.id.carouselRestaurant);
        imagesListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        imagesListView.setHasFixedSize(true);

        ImageItemAdapter imageAdapter = new ImageItemAdapter(getMonkImages(), getBaseContext());
        imagesListView.setAdapter(imageAdapter);

        MapView mapView = findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();

        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng coord = new LatLng(41.1622023,-8.656973);
        googleMap.addMarker(new MarkerOptions().position(coord).title("Porto").snippet("Welcome to Porto, Portugal!"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(coord, 16));
    }

    private void setToolbar() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Restaurant name");
        setSupportActionBar(myToolbar);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.action_favourite:
                Toast.makeText(this, " your favorite is clicked ", Toast.LENGTH_LONG).show();
                return true;
        }

        return true;
//        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private ArrayList<ImageItem> getMonkImages() {
        ArrayList<ImageItem> images = new ArrayList<>();
//
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_btn_borderless_material, imagePath));
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, imagePath));
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_scrubber_control_to_pressed_mtrl_000, imagePath));
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light, imagePath));
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_textfield_search_material, imagePath));
//        images.add(new ImageItem(androidx.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult, imagePath));

        return images;
    }
}