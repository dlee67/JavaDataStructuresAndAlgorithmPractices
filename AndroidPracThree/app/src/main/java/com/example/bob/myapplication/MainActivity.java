package com.example.bob.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fT;
    int cloneCount = 1;

    protected void addFragment(Fragment newFragment){
        fT = fragmentManager.beginTransaction();
        // Not populating the views; perhaps, it's because I am not
        // specifying the Fragment container.
        fT.add(R.id.stuffOne, newFragment, "clone" + cloneCount);
        cloneCount++;
        fT.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment newFragment = new FragmentOne();
        fT = fragmentManager.beginTransaction();
        fT.add(R.id.stuffOne, newFragment, "originFrag");
        fT.commit();
    }
}
