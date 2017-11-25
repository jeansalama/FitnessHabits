package com.strudelauxpommes.fitnesshabits.alcohol;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.strudelauxpommes.fitnesshabits.R;
import com.strudelauxpommes.fitnesshabits.data.model.DrinkData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Program on 2017-11-25.
 */

public class AlcoholDetailedAdapter extends RecyclerView.Adapter<AlcoholDetailedAdapter.ViewHolder> {

    public List<DrinkData> alcoholsList;

    public AlcoholDetailedAdapter(List<DrinkData> alcoholsList){
        //this.alcoholsList = alcoholsList;
        this.alcoholsList = generateDummyDrinkData();
    }

    public List<DrinkData> generateDummyDrinkData(){

        DrinkData drinkData = new DrinkData( 1, "categoryName", 3, 3, true);

        List<DrinkData> drinkDataList = new ArrayList<>();
        drinkDataList.add(drinkData);

        return drinkDataList;
    }

    public void setAlcoholsList(List<DrinkData> alcoholsList) {
        this.alcoholsList = alcoholsList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_alcohol_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //get Data
        DrinkData alcohol = alcoholsList.get(position);
        //Set if favorite
        boolean isFavorite = true; //TODO get true or false from data
        if(isFavorite){
            holder.alcoholDetailedStarButton.setBackgroundResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.alcoholDetailedStarButton.setBackgroundResource(R.drawable.ic_star_border_black_24dp);
        }
        //Set alcohol text
        holder.alcoholDetailedData.setText("DUMMY DATA"); //TODO ALCOHOL_TEXT

        //Set count
        holder.alcoholDetailedCossumptionCount.setText("5"); //TODO ALCOHOL_COUNT

        //Toggle favorite listenner button
        holder.alcoholDetailedStarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //TODO MAKE ALCOHOL INSANCE TOOGLE FAVORITE
            }
        });

        //Set minus listener button
        holder.alcoholDetailedDecrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //TODO REDUCE CONSUMPTION COUNT BY 1, UPDATE DATA ACCORDINGLY
            }
        });


        //Set add listener button
        holder.alcoholDetailedIncrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //TODO INCREASE CONSUMPTION COUNT BY 1, UPDATE DATA ACCORDINGLY
            }
        });
    }

    @Override
    public int getItemCount() {
        return alcoholsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton alcoholDetailedStarButton;
        TextView alcoholDetailedData;
        Button alcoholDetailedDecrementButton;
        TextView alcoholDetailedCossumptionCount;
        Button alcoholDetailedIncrementButton;

        public ViewHolder(View itemView) {
            super(itemView);
            alcoholDetailedStarButton = itemView.findViewById(R.id.favorite);
            alcoholDetailedData = itemView.findViewById(R.id.alcohol_data);
            alcoholDetailedDecrementButton = itemView.findViewById(R.id.decrement);
            alcoholDetailedCossumptionCount = itemView.findViewById(R.id.consumption);
            alcoholDetailedIncrementButton = itemView.findViewById(R.id.increment);
        }
    }



}
