package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MHprevention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhprevention);

        Button MHprevNxt = findViewById(R.id.MHprevNext);

        MHprevNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MHprevNxt = new Intent(MHprevention.this , MHprevention_2.class);

                startActivity(MHprevNxt);
            }
        });
    }
}