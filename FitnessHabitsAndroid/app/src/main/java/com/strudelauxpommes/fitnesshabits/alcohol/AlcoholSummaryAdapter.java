package com.strudelauxpommes.fitnesshabits.alcohol;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.strudelauxpommes.fitnesshabits.R;
import com.strudelauxpommes.fitnesshabits.data.model.DrinkData;

import java.util.List;

public class AlcoholSummaryAdapter extends RecyclerView.Adapter<AlcoholSummaryAdapter.ViewHolder> {

    public List<DrinkData> alcoholList;

    public AlcoholSummaryAdapter(List<DrinkData> alcoholList){ this.alcoholList = alcoholList;}

    public void setAlcoholList(List<DrinkData> alcoholList){
        this.alcoholList = alcoholList;
    }

    @Override
    public AlcoholSummaryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_alcohol_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AlcoholSummaryAdapter.ViewHolder holder, int position) {
        //get data
        DrinkData alcohol = alcoholList.get(position);

        holder.alcoholName.setText("TOTO"); //TODO

        holder.alcoholSummaryConssumptionCount.setText("10"); //TODO

        holder.alcoholSummaryConssumptionCount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //TODO ADD COUNT BY 1
            }
        });
    }

    @Override
    public int getItemCount() {
        return alcoholList.size() > 3 ? 3 : alcoholList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView alcoholName;
        TextView alcoholSummaryConssumptionCount;
        public ViewHolder(View view) {
            super(view);
            alcoholName = view.findViewById(R.id.alcohol_name);
            alcoholSummaryConssumptionCount = view.findViewById(R.id.portions);
        }
    }
}
