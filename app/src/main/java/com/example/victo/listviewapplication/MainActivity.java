package com.example.victo.listviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<StoryboardElement> elements = new ArrayList<>();

        elements.add(new StoryboardElement(255, 0, 0, 2.5));
        elements.add(new StoryboardElement(240, 124, 0, 0.5));
        elements.add(new StoryboardElement(35, 140, 9, 1.2));
        elements.add(new StoryboardElement(24, 98, 10, 0.85));
        elements.add(new StoryboardElement(255, 211, 145, .96));


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, elements);
        adapter.setClickListener(new MyRecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Random random = new Random();
                adapter.addNewItem(new StoryboardElement(random.nextInt(255), random.nextInt(255), random.nextInt(255), 1));
                Toast.makeText(MainActivity.this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);


    }
}
