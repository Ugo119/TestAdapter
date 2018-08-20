package com.example.ugo.testadapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Modified> first = new ArrayList<>();
        first.add(new Modified("This is a dessert popularly eaten in the eastern part of the country. It comprises fruits, vegetables and other things.", R.drawable.dishtwo));
        first.add(new Modified("Manchester United", R.drawable.dishtwo));
        first.add(new Modified("Chelsea", R.drawable.dishtwo));
        first.add(new Modified("Liverpool", R.drawable.dishtwo));
        first.add(new Modified("Tottenham", R.drawable.dishtwo));

// Create the adapter to convert the array to views
        ModAdapter adapter = new ModAdapter(this, first);
// Attach the adapter to a ListView
        final ListView listView = (ListView) findViewById(R.id.list_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView.getItemAtPosition(0);
                Intent i = new Intent(MainActivity.this,Nri.class);
                startActivity(i);
            }
        });

    }
}
