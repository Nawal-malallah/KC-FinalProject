package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAD_overview_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gad_overview2);

        Button GADovNxt2 = findViewById(R.id.GADovNxt2);

      GADovNxt2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent GADovNxt_2 = new Intent(GAD_overview_2.this , GAD_overview_3.class);

              startActivity(GADovNxt_2);

          }
      });
    }
}