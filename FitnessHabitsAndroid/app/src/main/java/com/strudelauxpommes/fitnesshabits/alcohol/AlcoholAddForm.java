package com.strudelauxpommes.fitnesshabits.alcohol;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.strudelauxpommes.fitnesshabits.R;

public class AlcoholAddForm extends AppCompatActivity {

    private AlcoholViewModel alcoholViewModel;

    Button okButton;
    Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol_add_form);

        cancelButton = findViewById(R.id.alcohol_form_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });

        okButton = findViewById(R.id.alcohol_form_ok);
        okButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //TODO add to DB
                finish();
            }
        });


        alcoholViewModel = ViewModelProviders.of(this).get(AlcoholViewModel.class);


    }
}
