package com.example.bob.broadcastprac;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "I WILL NAME YOUR CHARACTER, AH AH AH AH AH!", Toast.LENGTH_LONG).show();
    }
}
