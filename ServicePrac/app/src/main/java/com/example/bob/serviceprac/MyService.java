package com.example.bob.serviceprac;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {

    double clock = 0.0;

    @Override
    //Called when a client explicitly starts the service.
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }

    @Nullable
    @Override
    //The method below is strictly for the bindService(), where onBind must be returned.
    public IBinder onBind(Intent intent) {
        return null;
    }
}
