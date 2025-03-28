package com.example.norman_lee.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    Context context;
    LayoutInflater mInflater;
    ArrayList<CardModel> dataSource;

    //TODO 11.3 Complete the constructor to initialize the DataSource instance variable
    CardAdapter(Context context, ArrayList<CardModel> dataSource){
        mInflater = LayoutInflater.from(context);
    }


    //TODO 11.5 the layout of each Card is inflated and used to instantiate CharaViewHolder (no coding)
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = mInflater.inflate(R.layout.card, viewGroup, false);
        return new CardViewHolder(itemView);
    }

    //TODO 11.6 the data at position i is extracted and placed on the i-th card
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {

    }

    //TODO 11.7 the total number of data points must be returned here
    @Override
    public int getItemCount() {
        return 0;
    }

    //TODO 11.4 complete the constructor to initialize the instance variables by using findViewbyId
    static class CardViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewChara;
        TextView textViewName;

        CardViewHolder(View view){
            super(view);
            // initialize fields
        }

    }
}
