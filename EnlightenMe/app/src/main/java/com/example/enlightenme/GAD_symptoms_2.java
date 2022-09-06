package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAD_symptoms_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gad_symptoms2);

        Button GADsymNxt2 = findViewById(R.id.GADsymNxt2);

        GADsymNxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent GADsymNxt2 = new Intent(GAD_symptoms_2.this , GAD_symptoms_3.class);

                startActivity(GADsymNxt2);
            }
        });
    }
}