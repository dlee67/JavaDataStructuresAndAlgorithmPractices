package com.example.bob.intentsomeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentSomething = new Intent();
        intentSomething.setAction(Intent.ACTION_VIEW); // Should display a notification for a list
                                                       // application with satisfied actions in
                                                       // intent-filters.
        startActivity(intentSomething);
    }
}
