package com.example.myfirstapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaunchFromSMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_from_sms);

        //Launched from external link
        Uri data = getIntent().getData();
        //String strData = data.toString();
        //if (strScreenName.equals("com.your_package.something://"))  {
        //    // THIS IS OPTIONAL IN CASE YOU NEED TO VERIFY. THE ACTUAL USAGE IN MY APP IS BELOW THIS BLOCK
        //}
    }
}
