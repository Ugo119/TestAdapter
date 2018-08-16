package com.example.ugo.testadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> first = new ArrayList<>();
        first.add("Arsenal");
        first.add("Manchester United");
        first.add("Liverpool");
        first.add("Chelsea");
        first.add("Manchester City");
        first.add("WestHam");
        first.add("Tottenham");
        first.add("Burnley");
        first.add("Newcastle");
        first.add("Bournmouth");
        first.add("Fulham");
        first.add("Crystal Palace");
        first.add("Everton");
        first.add("Watford");
        first.add("WestBrom");
        first.add("Leeds");
        first.add("Celtic");
        first.add("Bolton");
        first.add("Huddersfield");
        first.add("Stoke");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, first);

        ListView listView = (ListView) findViewById(R.id.list_list);
        listView.setAdapter(itemsAdapter);
    }
}
