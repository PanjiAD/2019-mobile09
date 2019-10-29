package com.example.recycleviewgambartext.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.recycleviewgambartext.R;
import com.example.recycleviewgambartext.models.avengers;

public class avangersAdapter extends RecyclerView.Adapter<avangersAdapter.MyViewHolder> {
    List<avengers> avengersList;

    public avangersAdapter(List<avengers> avengersList) {
        this.avengersList = avengersList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View avengersView = layoutInflater.inflate(R.layout.item_avengers,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(avengersView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        avengers avengers = avengersList.get(position);
        holder.avengersName.setText(avengers.getName());
        holder.avengersSymbol.setImageDrawable(avengers.getSymbol());
    }

    @Override
    public int getItemCount() {
        return (avengersList != null) ? avengersList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView avengersName;
        public ImageView avengersSymbol;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            avengersName = itemView.findViewById(R.id.avangersName);
            avengersSymbol = itemView.findViewById(R.id.avangersSymbol);
        }
    }
}
