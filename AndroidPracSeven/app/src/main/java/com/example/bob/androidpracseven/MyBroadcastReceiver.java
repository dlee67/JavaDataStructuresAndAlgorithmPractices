package com.example.bob.androidpracseven;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "You thought it was French Bread, no! It was me! Toast!", Toast.LENGTH_LONG).show();
    }
}