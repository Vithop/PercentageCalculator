package com.example.vithu.mathmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class SecretActivity2 extends AppCompatActivity {

    RelativeLayout bckGroundLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret2);

        bckGroundLayout = (RelativeLayout) findViewById(R.id.bckGroundLayout);

        ToggleButton secretTogl = (ToggleButton) findViewById(R.id.colourToggle);
        secretTogl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    bckGroundLayout.setBackgroundColor(RED);
                }else{
                    bckGroundLayout.setBackgroundColor(YELLOW);
                }
            }
        });


    }
}
