package com.example.restaurantsapplication.restaurants;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.RestaurantItem;
import com.example.restaurantsapplication.restaurantsDetails.RestaurantDetailsActivity;

import java.util.ArrayList;
import java.util.List;

public class RestaurantItemAdapter extends RecyclerView.Adapter<RestaurantItemAdapter.RestaurantItemViewHolder> {
    private ArrayList<RestaurantItem> restaurants;
    private Context context;

    public RestaurantItemAdapter() {
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant_constraint_layout, parent, false);
        return new RestaurantItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemViewHolder holder, int position) {
        RestaurantItem restaurant = restaurants.get(position);

        Glide.with(this.context).load(restaurant.getImagePath()).into(holder.image);
        holder.title.setText(restaurant.getName());
        holder.description.setText(restaurant.getDescription());

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public void setData(List<RestaurantItem> restaurantsList, Context context) {
        this.restaurants = (ArrayList<RestaurantItem>) restaurantsList;
        this.context = context;
        notifyDataSetChanged();
    }

    class RestaurantItemViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        private AppCompatImageView image;
        private AppCompatTextView title;
        private AppCompatTextView description;

        public RestaurantItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            image = itemView.findViewById(R.id.restaurantImage);
            title = itemView.findViewById(R.id.restaurantTitle);
            description = itemView.findViewById(R.id.restaurantDescription);
        }

        @Override
        public void onClick(View v) {

            int pos = getLayoutPosition();

            Intent intent = new Intent(context, RestaurantDetailsActivity.class);

            intent.putExtra("name", restaurants.get(pos).getName());
            intent.putExtra("latitude", restaurants.get(pos).getLatitude());
            intent.putExtra("longitude", restaurants.get(pos).getLongitude());
            intent.putExtra("description", restaurants.get(pos).getDescription());
            //intent.putExtra("photos",(Serializable)restaurants.get(pos).getPhotos());

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent);
        }
    }



}
