package com.example.bob.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    /*
        The below methods briefly displays the life cycle of the Android
        Activity life cycle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //The line below fetches NULL, there must be a mechanism that is contraining
        //one activity to communicate with the
        //TextView mainTextView = (TextView)findViewById(R.id.SomeText);

        //And below two lines certainly do the job.
        TextView secondTextView = (TextView)findViewById(R.id.SecondTextSecond);
        secondTextView.setText(getIntent().getStringExtra("FROM_MAIN"));
    }
}