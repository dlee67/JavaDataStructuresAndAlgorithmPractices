package com.example.bob.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment{

    Button saiyanButton;
    View someView;

    public Fragment fragmentFactory(){
        Fragment newFragment = new FragmentOne();
        return newFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState){
        someView = inflater.inflate(R.layout.fragment_view, container, false);
        saiyanButton = someView.findViewById(R.id.saiyanButton);
        saiyanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The link below tells me how to use FragmentManager in associated Fragments.
                // https://stackoverflow.com/questions/15504274/fragmenttransaction-inside-a-fragment
                // But I don't get why I need to have the type casting below.
                ((MainActivity)getActivity()).addFragment(fragmentFactory());
            }
        });
        return someView;
    }
}
