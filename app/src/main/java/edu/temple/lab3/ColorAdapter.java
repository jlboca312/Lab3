package edu.temple.lab3;


import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class ColorAdapter extends ArrayAdapter{


    private String[] objects;

    public ColorAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View newView = super.getView(position, convertView, parent);

        //changes the color of each individual row of list view based on text
        for(int i=0; i<objects.length; i++){
            if(position == i){
                newView.setBackgroundColor(Color.parseColor(objects[i]));
            }
        }

        return newView;
    }


}
