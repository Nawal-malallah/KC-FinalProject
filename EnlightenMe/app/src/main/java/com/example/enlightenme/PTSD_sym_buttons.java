package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PTSD_sym_buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsd_sym_buttons);

        Button symAviod = findViewById(R.id.symAviod);
        Button symChanPER = findViewById(R.id.symChanPER);
        Button symChanTM = findViewById(R.id.symChanTM);
        Button symIntensity = findViewById(R.id.symIntensity);
        Button symIntrusive = findViewById(R.id.symIntrusive);

        symAviod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sym_aviod = new Intent(PTSD_sym_buttons.this , PTSD_symp_avoidance.class);

                startActivity(sym_aviod);
            }
        });

        symChanPER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sym_PER = new Intent(PTSD_sym_buttons.this , PTSD_symp_chanReaction.class);

                startActivity(sym_PER);
            }
        });

        symChanTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sym_TM = new Intent(PTSD_sym_buttons.this , PTSD_symp_chanThinkMood.class);

                startActivity(sym_TM);
            }
        });

        symIntensity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sym_TENSE = new Intent(PTSD_sym_buttons.this , PTSD_symp_intensity.class);

                startActivity(sym_TENSE);
            }
        });

        symIntrusive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sym_Intrusive = new Intent(PTSD_sym_buttons.this , PTSD_symp_intrusive.class);

                startActivity(sym_Intrusive);
            }
        });
    }
}