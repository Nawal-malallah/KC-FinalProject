package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PTSD_symptoms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsd_symptoms);

        Button PTSDsymNxt = findViewById(R.id.PTSDsymNxt);

        PTSDsymNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PTSDsymNxt = new Intent(PTSD_symptoms.this , PTSD_symptoms_2.class);

                startActivity(PTSDsymNxt);
            }
        });
    }
}