package com.example.mad_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    ImageButton TGr, TGs;

    SearchView srch;
    ListView lstView;
    String[] country;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    RelativeLayout rel_layout;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        lstView=rootView.findViewById(R.id.lstView);
        srch=rootView.findViewById(R.id.srch);
        rel_layout=rootView.findViewById(R.id.rel_layout);
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

        adapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,arrayList);

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

        TGr = rootView.findViewById(R.id.TGr);
        TGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),TravelgroupsActivity.class);
                startActivity(intent);
            }
        });
        TGs = rootView.findViewById(R.id.TGs);
        TGs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),tour_guides.class);
                startActivity(intent);
            }
        });
    return rootView;
    }

}
