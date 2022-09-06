package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAD_symptoms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gad_symptoms);

        Button GADsymNxt1 = findViewById(R.id.GADsymNxt1);

        GADsymNxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent GADsymNxt1 = new Intent(GAD_symptoms.this , GAD_symptoms_2.class);

                startActivity(GADsymNxt1);
            }
        });
    }
}