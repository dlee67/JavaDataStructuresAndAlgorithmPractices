package com.example.bob.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragOne = new FragmentOne();
        Fragment fragTwo = new FragmentTwo();
        Fragment fragThree = new FragmentThree();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fT = fragmentManager.beginTransaction();
        fT.add(R.id.stuffOne, fragOne);
        fT.add(R.id.stuffTwo, fragTwo);
        fT.add(R.id.stuffThree, fragThree);
        fT.commit();
    }
}
