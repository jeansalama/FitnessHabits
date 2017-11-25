package com.strudelauxpommes.fitnesshabits.alcohol;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.strudelauxpommes.fitnesshabits.FitnessHabitsApplication;
import com.strudelauxpommes.fitnesshabits.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Program on 2017-11-25.
 */

public class AlcoholDetailedView extends AppCompatActivity {

    private RecyclerView alcoholRecyclerView;
    private RecyclerView.Adapter alcoholAdapter;
    private RecyclerView.LayoutManager alcoholLayoutManager;
    private AlcoholViewModel alcoholViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol_detailed);

        alcoholRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        alcoholRecyclerView.setLayoutManager(alcoholLayoutManager);

        alcoholLayoutManager = new LinearLayoutManager(this);
        alcoholRecyclerView.setLayoutManager(alcoholLayoutManager);

        alcoholAdapter = new AlcoholDetailedAdapter(null);
        alcoholViewModel = ViewModelProviders.of(this).get(AlcoholViewModel.class);
        alcoholViewModel.init(FitnessHabitsApplication.application.getAlcoolRepository());
        /*alcoholViewModel.getLiveData().observe(this, drinkList ->{
            ( (AlcoholDetailedAdapter) alcoholAdapter).setAlcoholsList(drinkList);

        });
        */

        alcoholRecyclerView.setAdapter(alcoholAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_alcohol_detailed,menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.alcohol_action_add:
                Intent intent = new Intent(this, AlcoholAddForm.class);
                this.startActivity(intent);

            case R.id.alcohol_action_edit:

        }
        return true;
    }







}