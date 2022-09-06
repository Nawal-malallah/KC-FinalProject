package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MHriskFactors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhrisk_factors);

        Button RFnxt = findViewById(R.id.RFnxt);

        RFnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent RFnxt = new Intent(MHriskFactors.this , MHriskFactors_2.class);

                startActivity(RFnxt);
            }
        });
    }
}