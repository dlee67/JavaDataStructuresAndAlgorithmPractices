package com.example.bob.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends Fragment{
    Button saiyanButton;
    View someView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        someView = inflater.inflate(R.layout.fragment_view, container, false);
        saiyanButton = someView.findViewById(R.id.saiyanButton);
        return someView;
    }
}
