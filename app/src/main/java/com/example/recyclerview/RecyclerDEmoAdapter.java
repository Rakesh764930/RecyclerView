package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerDEmoAdapter extends RecyclerView.Adapter<RecyclerDEmoAdapter.DemmoViewHolder>{
public List<Country>countryList;
    public TextView title;
    @NonNull

    @Override
    public DemmoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row,parent,false);
        return new DemmoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DemmoViewHolder holder, int position) {
        final Country mCountry=countryList.get(position);
        holder.title.setText(mCountry.getTitle());
        holder.imgFlag.setImageResource(mCountry.getFlag());

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class DemmoViewHolder extends RecyclerView.ViewHolder{
public ImageView imgFlag;
public TextView title;

        public DemmoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag=itemView.findViewById(R.id.imgFlag);
            title=itemView.findViewById(R.id.title);

        }}
public RecyclerDEmoAdapter(List<Country>countryList){
            this.countryList=countryList;
}
    }












