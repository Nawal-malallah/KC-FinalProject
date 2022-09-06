package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAD_overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gad_overview);

        Button GADovNxt1 = findViewById(R.id.GADovNxt1);

        GADovNxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent GADovNxt1 =new Intent(GAD_overview.this , GAD_overview_2.class);

                startActivity(GADovNxt1);
            }
        });
    }
}