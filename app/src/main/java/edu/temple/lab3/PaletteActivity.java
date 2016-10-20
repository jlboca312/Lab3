package edu.temple.lab3;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;


public class PaletteActivity extends AppCompatActivity {

    //Set a global variables
    RelativeLayout rl;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //put listview into variable
        ListView lv = (ListView) findViewById(R.id.listView);




        Resources res = this.getResources();
        String[] colorLabels = res.getStringArray(R.array.colors_array);

        //create a custom adapter for the spinner to have the color array
        ColorAdapter colorAdapter = new ColorAdapter(PaletteActivity.this, android.R.layout.simple_spinner_dropdown_item, colorLabels);

        lv.setAdapter(colorAdapter);

        //deal with the list view listener
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the string of the color that you picked from the spinner
                //String color = parent.getItemAtPosition(position).toString();
                String color = (new Integer(position)).toString();

                //send the color string to CanvasActvity
                i = new Intent(PaletteActivity.this, CanvasActivity.class);
                i.putExtra("colorPicked", color);


                //start the activity
                startActivity(i);
            }
        });




    }
}
