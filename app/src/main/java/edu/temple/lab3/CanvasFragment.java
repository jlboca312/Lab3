package edu.temple.lab3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CanvasFragment extends Fragment{

    public CanvasFragment(){
        //empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_canvas, container, false);

        return v;

    }
}
