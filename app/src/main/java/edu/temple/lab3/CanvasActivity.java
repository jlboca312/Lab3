package edu.temple.lab3;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CanvasActivity extends AppCompatActivity{

    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //extract the color string from PaletteActivity
        Intent intent = getIntent();
        String color = intent.getExtras().getString("colorPicked"); //colorPicked is the key from the PaletteActivity

        //put layout into variable
        rl = (RelativeLayout) findViewById(R.id.MyLayout);

        //set the background of the activity to the color you picked
        rl.setBackgroundColor(Color.parseColor(color));
    }
}
