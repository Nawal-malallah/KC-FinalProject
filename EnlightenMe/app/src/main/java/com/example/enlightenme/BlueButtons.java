package com.example.enlightenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlueButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_buttons);

        Button MIprev = findViewById(R.id.MIprev);
        Button MIov = findViewById(R.id.MIov);
        Button MIsym = findViewById(R.id.MIsym);
        Button MIdoc = findViewById(R.id.MIdoc);
        Button MIhelpL = findViewById(R.id.MIhelpL);
        Button MIrf = findViewById(R.id.MIrf);
        Button MImms = findViewById(R.id.MImms);
        Button MIcom = findViewById(R.id.MIcom);
        Button MIcuz = findViewById(R.id.MIcuz);

        MIprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent prev = new Intent(BlueButtons.this , MHprevention.class);

                startActivity(prev);

            }
        });

        MIov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIov = new Intent(BlueButtons.this , MHoverview.class);

                startActivity(MIov);

            }
        });

        MIsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MIsym = new Intent(BlueButtons.this , MHsymptoms.class);

                startActivity(MIsym);

            }
        });

        MIdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIdoc = new Intent(BlueButtons.this , MHwhenToSeeADoctor.class);

                startActivity(MIdoc);

            }
        });

        MIhelpL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIhelpL = new Intent(BlueButtons.this , MHhelpingAlovedOne.class);

                startActivity(MIhelpL);
            }
        });

        MIrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIrf = new Intent(BlueButtons.this , MHriskFactors.class);

                startActivity(MIrf);
            }
        });

        MImms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MImms = new Intent(BlueButtons.this , MH_mmsMHproblems.class);

                startActivity(MImms);
            }
        });

        MIcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIcom = new Intent(BlueButtons.this , CommonMentalprob_Buttons.class);

                startActivity(MIcom);
            }
        });

        MIcuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MIcuz = new Intent(BlueButtons.this , MHcauses.class);

                startActivity(MIcuz);
            }
        });

    }
}