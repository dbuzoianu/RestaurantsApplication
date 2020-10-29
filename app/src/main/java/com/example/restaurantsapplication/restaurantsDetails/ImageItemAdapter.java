package com.example.restaurantsapplication.restaurantsDetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.restaurantsapplication.R;
import com.example.restaurantsapplication.model.ImageItem;

import java.util.ArrayList;

public class ImageItemAdapter extends RecyclerView.Adapter<ImageItemAdapter.ImageItemViewHolder>{
    private ArrayList<ImageItem> images;
    private Context context;

    public ImageItemAdapter(ArrayList<ImageItem> images, Context context) {
        this.images = images;
        this.context = context;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ImageItemAdapter.ImageItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_restaurant, parent, false);
        return new ImageItemAdapter.ImageItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageItemAdapter.ImageItemViewHolder holder, int position) {
        ImageItem image = images.get(position);

        Glide.with(this.context).load(image.getImagePath()).into(holder.image);
        //holder.image.setImageDrawable(ContextCompat.getDrawable(context, image.getIcon()));

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    class ImageItemViewHolder extends RecyclerView.ViewHolder{
        private AppCompatImageView image;

        public ImageItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.detailsImage);
        }
    }
}
