package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExperiencesActivity extends AppCompatActivity {

    Button kn2,ex2,pa2,ex_backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiences);

        kn2 = findViewById(R.id.kn2);
        kn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExperiencesActivity.this,KnowmoreActivity.class);
                startActivity(intent);
            }
        });

        pa2 = findViewById(R.id.pa2);
        pa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExperiencesActivity.this,PackagesActivity.class);
                startActivity(intent);
            }
        });

        ex_backbtn = findViewById(R.id.ex_backbtn);
        ex_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExperiencesActivity.this,TraveltribesActivity.class);
                startActivity(intent);
            }
        });
    }
}