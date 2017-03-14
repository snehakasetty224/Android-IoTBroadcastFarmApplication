package com.example.sneha.farmmanagerreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class FarmBroadcastReceiver extends BroadcastReceiver {

    public static final String tag = "Receiver";
    public static float temperature = 0;
    public static float humidity = 0;


    @Override
    public void onReceive(Context context, Intent intent) {
        temperature = intent.getFloatExtra("temperature",0);
        humidity = intent.getFloatExtra("humidity",0);
        Log.d(tag, String.valueOf(temperature));
        Log.d(tag,String.valueOf(humidity));
    }
}
