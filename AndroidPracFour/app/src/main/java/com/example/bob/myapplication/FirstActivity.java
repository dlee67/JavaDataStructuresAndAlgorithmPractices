package com.example.bob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity{

    int playValue;

    //https://stackoverflow.com/questions/10477375/what-does-classname-class-return
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        playValue = getIntent().getIntExtra("play", 0);
        Button button = findViewById(R.id.firstShoot);
        TextView playView = findViewById(R.id.playView);
        playView.setText("" + playValue);
        final Intent newIntent = new Intent(this, SecondActivity.class);
        newIntent.putExtra("play", (playValue + 1));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(newIntent);
                finish();
            }
        });
    }
}
