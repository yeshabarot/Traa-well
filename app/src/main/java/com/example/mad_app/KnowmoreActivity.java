package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KnowmoreActivity extends AppCompatActivity {


    Button kn,ex,pa,kn_backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowmore);
        ex = findViewById(R.id.ex);
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KnowmoreActivity.this,ExperiencesActivity.class);
                startActivity(intent);
            }
        });

        pa = findViewById(R.id.pa);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KnowmoreActivity.this,PackagesActivity.class);
                startActivity(intent);
            }
        });

        kn_backbtn = findViewById(R.id.kn_backbtn);
        kn_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KnowmoreActivity.this,TraveltribesActivity.class);
                startActivity(intent);
            }
        });


    }
}