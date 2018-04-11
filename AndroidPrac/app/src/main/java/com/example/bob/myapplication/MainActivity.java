package com.example.bob.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*
        The below methods briefly displays the life cycle of the Android
        Activity life cycle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button)findViewById(R.id.IntentButton);
    }

    public void toSecond(View view){
        Intent secondIntent = new Intent(this, SecondActivity.class);
        startActivity(secondIntent);
    }
}
