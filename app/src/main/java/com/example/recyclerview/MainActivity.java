package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCountryList;
 private List<Country> countryList;
 private RecyclerDEmoAdapter demoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        populateData();
        demoAdapter=new RecyclerDEmoAdapter(countryList);
        rvCountryList=findViewById(R.id.rvCountryList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvCountryList.setAdapter(demoAdapter);
        rvCountryList.setLayoutManager(layoutManager);
    }
    private void populateData(){
        countryList=new ArrayList<>();
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("Germany",R.drawable.gm));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Australia",R.drawable.au));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("Germany",R.drawable.gm));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Australia",R.drawable.au));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("Germany",R.drawable.gm));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Australia",R.drawable.au));




    }
}
