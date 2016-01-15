package com.cloudsherpas.dynamicbroadcastreceiverdemo;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PowerStatusReceiver receiver = new PowerStatusReceiver();
        final IntentFilter filter = new IntentFilter();

        //TODO:
        // Add required intent for checking power status

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    //TODO:
                    // When toggle button is checked, app should respond to any change in the
                    // device power status
                } else {
                    //TODO:
                    // When toggle button is unchecked, app should ignore any event in
                    // device power status
                }
            }
        });
    }
}
