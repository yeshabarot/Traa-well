package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tour_guides extends AppCompatActivity {

    Button gu_backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guides);

        gu_backbtn = findViewById(R.id.gu_backbtn);
        gu_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tour_guides.this,HomeFragment.class);
                startActivity(intent);
            }
        });

    }
}