package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAD_buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gad_buttons);

        Button anxOV = findViewById(R.id.anxOV);
        Button anxSym = findViewById(R.id.anxSym);
        Button anxKidTeen = findViewById(R.id.anxKidTeen);
        Button anxDoc = findViewById(R.id.anxDoc);

        anxOV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anxOV = new Intent(GAD_buttons.this , GAD_overview.class);

                startActivity(anxOV);
            }
        });

        anxSym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anxSym = new Intent(GAD_buttons.this , GAD_symptoms.class);

                startActivity(anxSym);
            }
        });

        anxKidTeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anxKidTeen = new Intent(GAD_buttons.this , GAD_sympKidTeen.class);

                startActivity(anxKidTeen);
            }
        });

        anxDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anxDoc = new Intent(GAD_buttons.this , GAD_seeDoctor.class);

                startActivity(anxDoc);
            }
        });

    }
}