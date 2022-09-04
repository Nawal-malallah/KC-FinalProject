package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommonMentalprob_Buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_mentalprob_buttons);

        Button dep = findViewById(R.id.dep);
        Button anx = findViewById(R.id.anx);
        Button panic = findViewById(R.id.panic);
        Button ptsd = findViewById(R.id.ptsd);

        dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dep = new Intent(CommonMentalprob_Buttons.this , Dep_Buttons.class);

                startActivity(dep);
            }
        });

        anx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anx = new Intent(CommonMentalprob_Buttons.this , GAD_buttons.class);

                startActivity(anx);
            }
        });

        panic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent panic = new Intent(CommonMentalprob_Buttons.this , PD_buttons.class);

                startActivity(panic);
            }
        });

        ptsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ptsd = new Intent(CommonMentalprob_Buttons.this , PTSD_buttons.class);

                startActivity(ptsd);
            }
        });

    }
}