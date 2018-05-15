package com.example.bob.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fT;
    Button mutateButton;
    int cloneCount = 1;

    protected void addFragment(Fragment newFragment){
        fT = fragmentManager.beginTransaction();
        // Not populating the views; perhaps, it's because I am not
        // specifying the Fragment container.
        fT.add(R.id.stuffOne, newFragment, "clone" + cloneCount);
        cloneCount++;
        fT.commit();
    }

    protected void mutateCloneFive(){
        Fragment frag = fragmentManager.findFragmentByTag("clone5");
        TextView mutateThis = frag.getView() // fetches the parent view, which the view that has been inflated via Fragment is a child of.
                              .findViewById(R.id.fragmentTextView); // Since, findViewById() is a method that is part of View,
                                                                    // I am allowed to do this.
        mutateThis.setText("Mastered Ultra Instinct");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mutateButton = findViewById(R.id.mutateStuff);
        mutateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mutateCloneFive();
            }
        });
        Fragment newFragment = new FragmentOne();
        fT = fragmentManager.beginTransaction();
        fT.add(R.id.stuffOne, newFragment, "originFrag");
        fT.commit();
    }
}
