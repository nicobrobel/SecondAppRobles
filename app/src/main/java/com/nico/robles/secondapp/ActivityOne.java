package com.nico.robles.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void callAct1App1 (View view){
        Intent intent = new Intent("com.nico.robles.firstapp.ActivityTwo");
        startActivity(intent);
    }

}
