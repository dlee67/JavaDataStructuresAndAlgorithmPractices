package com.example.bob.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart() {
        //This method is called, and operates only for a moment, then,
        //the system quickly calls the onResume().
        super.onStart();
    }

    @Override
    public void onResume(){
        //This method is what allows the interaction with the user,
        //after onPause(); also, this is kinda tricky part of intuitive understand,
        //but right after the onStart(), resume is a state where the task is,
        //there is actually a picture which describes this brain farty concept.
        super.onResume();
    }

    @Override
    public void onPause(){
        //When an interruptive event occurs, already running activity invoke this method.
        super.onPause();
        setContentView(R.layout.some_view);
    }

    @Override
    public void onStop() {
        //When an activity is no longer visible to the user, this method is invoked,
        //and the task that was running this activity goes into a stop state.
        super.onStop();
    }

    @Override
    public void onDestroy(){
        //This method is called when the task goes into a destroy state.
        super.onDestroy();
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle){
        //This method is only called when I am restoring a saved instance.
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        //This method is automatically called, when the activity is to be
        //destroyed, where this method is used to save the instance of the activity.
        super.onSaveInstanceState(bundle);
    }
}
