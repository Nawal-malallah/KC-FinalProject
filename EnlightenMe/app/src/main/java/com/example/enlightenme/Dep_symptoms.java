package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dep_symptoms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_symptoms);

        Button depSymnxt = findViewById(R.id.depSymNxt);

        depSymnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent depSymnxt = new Intent(Dep_symptoms.this , Dep_symptoms_2.class);
            }
        });
    }
}