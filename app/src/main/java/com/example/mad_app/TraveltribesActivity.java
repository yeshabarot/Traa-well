package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TraveltribesActivity extends AppCompatActivity {
    ImageButton tt_box1, tt_box2, tt_box3,tt_backbtn;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveltribes);

        tt_box1 = findViewById(R.id.tt_box1);
        tt_box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TraveltribesActivity.this,KnowmoreActivity.class);
                startActivity(intent);
            }
        });

        tt_box2 = findViewById(R.id.tt_box2);
        tt_box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TraveltribesActivity.this,ExperiencesActivity.class);
                startActivity(intent);
            }
        });

        tt_box3 = findViewById(R.id.tt_box3);
        tt_box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TraveltribesActivity.this,PackagesActivity.class);
                startActivity(intent);
            }
        });

//        tt_backbtn = findViewById(R.id.tt_backbtn);
//        tt_backbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TraveltribesActivity.this,TravelgroupsActivity.class);
//                startActivity(intent);
//            }
//        });





    }
}