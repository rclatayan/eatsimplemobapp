package com.example.eatsimplemobapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatsimplemobapp.R;
import com.example.eatsimplemobapp.models.AllRestaurantsModels;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class AllRestaurantAdapter extends RecyclerView.Adapter<AllRestaurantAdapter.ViewHolder> {

    List<AllRestaurantsModels> list;

    public AllRestaurantAdapter(List<AllRestaurantsModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.all_res_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.roundedImageView.setImageResource(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView roundedImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView2);

        }
    }
}
