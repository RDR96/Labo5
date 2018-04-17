package com.rdrcorvera.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Planeta> planetas;
    RecyclerView recyclerView;
    PlanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Con esto se llena a la lista
        planetas = new ArrayList<Planeta>();
        fillList(planetas);

        //Se le asigna al recycleView
        adapter = new PlanetAdapter(this,planetas);
        recyclerView = findViewById(R.id.RecView);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);
        recyclerView.setAdapter(adapter);
    }

    private void fillList(List<Planeta> l){
        String description = "Lorem ipsum";
        l.add(new Planeta(1,"Ella",description));
        l.add(new Planeta(1,"Ella2",description));
        l.add(new Planeta(1,"Ella3",description));
    }

}
