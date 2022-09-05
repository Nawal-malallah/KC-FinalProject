package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PD_buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pd_buttons);

        Button PDov = findViewById(R.id.PDov);
        Button PDsym = findViewById(R.id.PDsym);
        Button PDdoc = findViewById(R.id.PDdoc);


        PDov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PDov = new Intent(PD_buttons.this , PD_overview.class);

                startActivity(PDov);
            }
        });

        PDsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PDsym = new Intent(PD_buttons.this , PD_symptoms.class);

                startActivity(PDsym);
            }
        });

        PDdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PDdoc = new Intent(PD_buttons.this , PD_seeDoctor.class);

                startActivity(PDdoc);
            }
        });
    }
}