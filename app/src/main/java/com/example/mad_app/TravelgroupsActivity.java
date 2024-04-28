package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.card.MaterialCardView;

public class TravelgroupsActivity extends AppCompatActivity {

    ImageButton tg_btn1, tg_btn2, tg_btn3, tg_btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelgroups);
        tg_btn1 = findViewById(R.id.tg_btn1);
        tg_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TravelgroupsActivity.this,TraveltribesActivity.class);
                startActivity(intent);
            }
        });

        tg_btn2 = findViewById(R.id.tg_btn2);
        tg_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TravelgroupsActivity.this,JugniActivity.class);
                startActivity(intent);
            }
        });
        tg_btn3 = findViewById(R.id.tg_btn3);
        tg_btn4 = findViewById(R.id.tg_btn4);


    }

//    public void openNew(View view) {
//    }
}