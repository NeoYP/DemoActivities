package com.myapplicationdev.android.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        //Get the button and set the OnClickListener
        Button btnDone = findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Get the EditText that user keys in name
                EditText etName = findViewById(R.id.editTextName);
                //Get the EditText that user keys in age
                EditText etAge = findViewById(R.id.editTextAge);
                //Put the name and age into an array
                String[] info = {etName.getText().toString(), etAge.getText().toString()};
                //Create an intent to start another activity called DemoActivities(which we would create later)
                Intent i = new Intent(DemoActivities.this, DemoActivities2.class);
                //Pass the String array holding the ame & age to new activity
                i.putExtra("info", info);
                //Start the new activity
                startActivity(i);
            }
        });
    }
}
