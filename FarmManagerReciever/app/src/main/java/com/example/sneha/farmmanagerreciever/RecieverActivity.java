package com.example.sneha.farmmanagerreciever;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RecieverActivity extends Activity {

    public static boolean fanvalue = false;
    public static boolean sprinklervalue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        Log.d("Receiver","Started");

    }
    public void onclickTemphumiditybutton(View v){
        float temp = FarmBroadcastReceiver.temperature;

        if (temp > 70 && temp < 90){
            fanvalue = true;
        } else if (temp >= 90 && temp < 125){
            fanvalue = true;
            sprinklervalue = true;
        } else{
            fanvalue = false;
            sprinklervalue = false;
        }
        Intent intent = new Intent(RecieverActivity.this,FarmMaintainace.class);
        startActivity(intent);
    }
    public void onclickFanOn(View v){
        Intent intent = new Intent(RecieverActivity.this,FarmMaintainace.class);
        fanvalue = true;
        sprinklervalue = false;
        startActivity(intent);

    }
    public void onclickFanandSprinklerOn(View v){
        Intent intent = new Intent(RecieverActivity.this,FarmMaintainace.class);
        sprinklervalue = true;
        fanvalue = true;
        startActivity(intent);

    }
}
