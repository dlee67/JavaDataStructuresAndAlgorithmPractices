package com.example.bob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

    int playValue;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);
        playValue = getIntent().getIntExtra("play", 0);
        Button button = findViewById(R.id.shootSecond);
        TextView playView = findViewById(R.id.playView);
        playView.setText("" + playValue);
        final Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("play", (playValue + 1));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });
    }
}
