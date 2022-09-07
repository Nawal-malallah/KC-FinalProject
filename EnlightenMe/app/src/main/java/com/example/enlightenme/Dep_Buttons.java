package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dep_Buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_buttons);

        Button depOV = findViewById(R.id.depOV);
        Button depsym = findViewById(R.id.depSym);
        Button depKidTeen = findViewById(R.id.depKidTeen);
        Button depAdult = findViewById(R.id.depAdult);
        Button depDoc = findViewById(R.id.depDoc);
        Button depEmergancy = findViewById(R.id.depEmergency);


        depOV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depOV = new Intent(Dep_Buttons.this , Dep_overview.class);

                startActivity(depOV);
            }
        });

        depsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depsym = new Intent(Dep_Buttons.this , Dep_symptoms.class);

                startActivity(depsym);
            }
        });

        depKidTeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depKidTeen = new Intent(Dep_Buttons.this , Dep_sympKidTeen.class);

                startActivity(depKidTeen);
            }
        });

        depAdult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depAdult = new Intent(Dep_Buttons.this , Dep_sympAdults.class);

                startActivity(depAdult);
            }
        });

        depDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depDoc = new Intent(Dep_Buttons.this , Dep_seeDoctor.class);

                startActivity(depDoc);
            }
        });

        depEmergancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depEmergancy = new Intent(Dep_Buttons.this , Dep_emergencyHelp.class);

                startActivity(depEmergancy);
            }
        });

    }
}