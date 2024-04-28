package com.example.mad_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class homePage extends AppCompatActivity {

    ImageButton TGr, TGs;

    SearchView srch;
    ListView lstView;
    String[] country;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    RelativeLayout rel_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);


        lstView=findViewById(R.id.lstView);
        srch=findViewById(R.id.srch);
        rel_layout=findViewById(R.id.rel_layout);
        arrayList=new ArrayList<>();
        arrayList.add("Delhi");
        arrayList.add("Manali");
        arrayList.add("Jaipur");
        arrayList.add("Shrinagar");
        arrayList.add("Jaisalmer");
        arrayList.add("Shimla");
        arrayList.add("Goa");
        arrayList.add("Assam");
        arrayList.add("Shillong");
        arrayList.add("Hyderabad");
        lstView.setVisibility(View.GONE);

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);

        lstView.setAdapter(adapter);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s1=parent.getItemAtPosition(position).toString();
                srch.setQuery(s1,false);
                lstView.setVisibility(View.GONE);
                srch.clearFocus();
            }
        });

        srch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                String str=s;
                lstView.bringToFront();

                adapter.getFilter().filter(s);
                if(TextUtils.isEmpty(str))
                {
                    lstView.setVisibility(View.GONE);
                }
                else {
                    lstView.setVisibility(View.VISIBLE);
                }

//                Toast.makeText(homePage.this, "Place selected", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        TGr = findViewById(R.id.TGr);
        TGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePage.this,TravelgroupsActivity.class);
                startActivity(intent);
            }
        });
        TGs = findViewById(R.id.TGs);
        TGs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePage.this,tour_guides.class);
                startActivity(intent);
            }
        });

    }

}