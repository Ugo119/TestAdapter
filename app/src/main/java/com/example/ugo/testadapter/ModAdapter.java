package com.example.ugo.testadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ModAdapter extends ArrayAdapter<Modified> {
    public ModAdapter(Context context, ArrayList<Modified> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Modified user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.modified_list, parent, false);
        }
        // Lookup view for data population
        ImageView food = (ImageView) convertView.findViewById(R.id.imageView);
        TextView desc = (TextView) convertView.findViewById(R.id.text_description);
        // Populate the data into the template view using the data object
        food.setImageResource(user.imageResource);
        desc.setText(user.description);
        // Return the completed view to render on screen

        return convertView;

        }

}
