package com.cloudsherpas.dynamicbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerStatusReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        String response = "Unknown";
        if(action.equals(Intent.ACTION_POWER_CONNECTED)) {
            response = "CHARGING";
        }
        else if(action.equals(Intent.ACTION_POWER_DISCONNECTED)) {
            response = "NOT CHARGING";
        }

        Toast.makeText(context, response, Toast.LENGTH_LONG).show();
    }
}
