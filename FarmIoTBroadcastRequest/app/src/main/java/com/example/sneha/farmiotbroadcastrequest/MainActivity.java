package com.example.sneha.farmiotbroadcastrequest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText temp;
    private EditText humid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText) findViewById(R.id.editText);
        humid = (EditText) findViewById(R.id.editText2);
    }


    public void setValues(View V){
        Intent broadcastIntent = new Intent("com.test");
        broadcastIntent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        Float temp1 = Float.parseFloat(temp.getText().toString());
        Float humid1 = Float.parseFloat(humid.getText().toString());
        broadcastIntent.putExtra("temperature",temp1);
        broadcastIntent.putExtra("humidity",humid1);
        this.sendBroadcast(broadcastIntent);
        Log.d("test","Hello values were broadcasted successfully");
          }

    public void cancelbutton(View V){
        temp.setText("");
        humid.setText("");
    }


}
