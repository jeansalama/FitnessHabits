package com.strudelauxpommes.fitnesshabits.alcohol;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.strudelauxpommes.fitnesshabits.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlcoholFragment extends Fragment {
    private RecyclerView alcoholRecycler;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private TextView alcoholSummaryTitle;
    List<Alcohol> alcoholList = new ArrayList<>(); //TODO GET ACTUAL LIST
    public AlcoholFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_alcohol, container, false);

        alcoholRecycler = (RecyclerView)  rootView.findViewById(R.id.alcohol_recycler);

        layoutManager = new LinearLayoutManager(getActivity());
        alcoholRecycler.setLayoutManager(layoutManager);

        adapter = new AlcoholSummaryAdapter(alcoholList);
        alcoholRecycler.setAdapter(adapter);


        alcoholSummaryTitle = rootView.findViewById(R.id.alcohol_title);

        alcoholSummaryTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO open Detailed Alcohol Activity
                Intent openDetailed = new Intent(getActivity(), AlcoholDetailedView.class);
                startActivity(openDetailed);
            }
        });

        return rootView;
    }



}
