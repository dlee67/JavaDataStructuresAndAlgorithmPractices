package com.example.bob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity{
    //https://stackoverflow.com/questions/10477375/what-does-classname-class-return
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        Button button = findViewById(R.id.firstShoot);
        final Intent newIntent = new Intent(this, SecondActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(newIntent);
                finish();
            }
        });
    }
}
