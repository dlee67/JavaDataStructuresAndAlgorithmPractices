package com.example.bob.intentforseven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String CUSTOM_INTENT = "com.example.bob.intentforseven.REPORT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button someButton = (Button)findViewById(R.id.SomeButton);
        someButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(CUSTOM_INTENT);
                sendBroadcast(i);
            }
        });
    }
}
