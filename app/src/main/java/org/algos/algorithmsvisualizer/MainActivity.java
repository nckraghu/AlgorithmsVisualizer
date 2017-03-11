package org.algos.algorithmsvisualizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> algosData = new ArrayList<String>();
        algosData.add("Binary Search Tree");
        algosData.add("Red Black Tree");
        algosData.add("Djikstra's Algorithm");
        algosData.add("KMP Algorithm");

        AlgosChooserAdapter algosChooserAdapter = new AlgosChooserAdapter(algosData);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.algosRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        recyclerView.setAdapter(algosChooserAdapter);

    }
}
