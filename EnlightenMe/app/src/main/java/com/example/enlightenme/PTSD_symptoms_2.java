package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PTSD_symptoms_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsd_symptoms2);

        Button PTSDsymNxt2 = findViewById(R.id.PTSDsymNxt2);

        PTSDsymNxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PTSDsym_nxt2 = new Intent(PTSD_symptoms_2.this , PTSD_sym_buttons.class);

                startActivity(PTSDsym_nxt2);
            }
        });
    }
}