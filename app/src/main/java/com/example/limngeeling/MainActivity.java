package com.example.limngeeling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSPMqualification(View view) {
        Log.d(LOG_TAG, "SPM clicked!");
        Intent intent = new Intent(this, SPM.class);
        startActivity(intent);

    }

    public void launchOlevelqualification(View view) {
        Log.d(LOG_TAG, "O Level clicked!");
        Intent intent = new Intent(this, Olevel.class);
        startActivity(intent);

    }

    public void launchUECqualification(View view) {
        Log.d(LOG_TAG, "UEC clicked!");
        Intent intent = new Intent(this, Olevel.class);
        startActivity(intent);

    }
}
