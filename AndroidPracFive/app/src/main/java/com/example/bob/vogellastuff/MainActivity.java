package com.example.bob.vogellastuff;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent newIntent = new Intent(Intent.ACTION_VIEW); //My app has an intention to view something,
        //Intent example = new Intent(Intent.ACTION_VIEW, someActivity.class); <- where that intent will specifically start someActivity
        //but it doesn't have a specific activity
        //to open in mind.
        newIntent.setData(Uri.parse("https://www.google.com")); //operate on this data.
        startActivity(newIntent); //Convey my application's intent.
    }
}
