package com.example.sneha.farmmanagerreciever;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import static com.example.sneha.farmmanagerreciever.RecieverActivity.fanvalue;
import static com.example.sneha.farmmanagerreciever.RecieverActivity.sprinklervalue;

public class FarmMaintainace extends Activity {

    public static Button fan =null;
    public static Button sprinkler =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_maintainace);
        fan = (Button) this.findViewById(R.id.button8);
        sprinkler = (Button) this.findViewById(R.id.button7);
    }

    public void onResume(){
        super.onResume();
        if (fanvalue == true && sprinklervalue == true ) {
            fan.setText("FAN ON");
            sprinkler.setText("SPRINKLER ON");
        }else if(fanvalue == false && sprinklervalue == true ) {
            fan.setText("FAN OFF");
            sprinkler.setText("SPRINKLER ON");
        }
        else if (fanvalue == true && sprinklervalue == false){
            sprinkler.setText("SPRINKLER OFF");
            fan.setText("FAN ON");
        }
        else if (sprinklervalue == false && fanvalue == false){
            fan.setText("FAN OFF");
            sprinkler.setText("SPRINKLER OFF");
        }

    }
}
