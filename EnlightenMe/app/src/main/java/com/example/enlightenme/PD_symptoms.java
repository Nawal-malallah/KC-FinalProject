package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PD_symptoms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pd_symptoms);

        Button PDsymNxt = findViewById(R.id.PDsymNxt);

        PDsymNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PDsymNxt = new Intent(PD_symptoms.this , PD_symptoms_2.class);

                startActivity(PDsymNxt);
            }
        });
    }
}