package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PackagesActivity extends AppCompatActivity {

    Button kn3,ex3,p_backbtn, btn1, btn2, btn3, btn4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);

        kn3 = findViewById(R.id.kn3);
        kn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PackagesActivity.this,KnowmoreActivity.class);
                startActivity(intent);
            }
        });

        ex3 = findViewById(R.id.ex3);
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PackagesActivity.this,ExperiencesActivity.class);
                startActivity(intent);
            }
        });

        p_backbtn = findViewById(R.id.p_backbtn);
        p_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PackagesActivity.this,TraveltribesActivity.class);
                startActivity(intent);
            }
        });

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PackagesActivity.this, "Package 1 clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PackagesActivity.this, "Package 2 clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PackagesActivity.this, "Package 3 clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PackagesActivity.this, "Package 4 clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
















