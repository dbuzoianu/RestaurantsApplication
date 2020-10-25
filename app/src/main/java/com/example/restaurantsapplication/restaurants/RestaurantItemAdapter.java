package com.example.restaurantsapplication.restaurants;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.RestaurantItem;

import java.util.ArrayList;
import java.util.List;

public class RestaurantItemAdapter extends RecyclerView.Adapter<RestaurantItemAdapter.RestaurantItemViewHolder> {
    private ArrayList<RestaurantItem> restaurants;
    private Context context;
    //private final View.OnClickListener mOnClickListener = new RestaurantClickListener();


    public RestaurantItemAdapter(ArrayList<RestaurantItem> restaurants, Context context) {
        this.restaurants = restaurants;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant_constraint_layout, parent, false);
//        view.setOnClickListener(mOnClickListener);
        return new RestaurantItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemViewHolder holder, int position) {
        RestaurantItem restaurant = restaurants.get(position);

        holder.image.setImageDrawable(ContextCompat.getDrawable(context, restaurant.getIcon()));
        holder.title.setText(restaurant.getName());
        holder.description.setText(restaurant.getDescription());


    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public void setData(List<RestaurantItem> restaurantsList) {
        this.restaurants = (ArrayList<RestaurantItem>) restaurantsList;
        this.context = context;
        notifyDataSetChanged();
    }


    class RestaurantItemViewHolder extends RecyclerView.ViewHolder{
        private AppCompatImageView image;
        private AppCompatTextView title;
        private AppCompatTextView description;

        public RestaurantItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.restaurantImage);
            title = itemView.findViewById(R.id.restaurantTitle);
            description = itemView.findViewById(R.id.restaurantDescription);
        }
    }
}
