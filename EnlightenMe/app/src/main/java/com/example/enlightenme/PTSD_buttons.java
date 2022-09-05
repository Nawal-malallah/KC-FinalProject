package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PTSD_buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsd_buttons);

        Button PTSDov = findViewById(R.id.PTSDov);
        Button PTSDsym = findViewById(R.id.PTSDsym);
        Button PTSDdoc = findViewById(R.id.PTSDdoc);

        PTSDov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PTSDov = new Intent(PTSD_buttons.this , PTSD_overview.class);

                startActivity(PTSDov);
            }
        });

        PTSDsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PTSDsym = new Intent(PTSD_buttons.this , PTSD_symptoms.class);

                startActivity(PTSDsym);
            }
        });

        PTSDdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PTSDdoc = new Intent(PTSD_buttons.this , PTSD_seeDoctor.class);

                startActivity(PTSDdoc);
            }
        });

    }
}