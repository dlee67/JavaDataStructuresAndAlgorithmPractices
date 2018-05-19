package com.example.bob.serviceprac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //https://www.tutorialspoint.com/android/android_services.htm
    public void startService(View view){
        startService(new Intent(this, MyService.class)); //MyService.class is the service here.
    }

    public void stopService(View view){
        stopService(new Intent(this, MyService.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
