package com.example.hw_android_2_7_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivit2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activit2);
        TextView current = findViewById(R.id.currentPolicies);
        String text = getIntent().getStringExtra("key1");
        current.setText(text);
        Log.d("homework", "onCreate MainActivity2");



    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("homework", "onStart MainActivity2");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("homework", "onResume MainActivity2");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("homework", "onPause MainActivity2");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("homework", "onStop MainActivity2");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("homework", "onRestart MainActivity2");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("homework", "onDestroy MainActivity2");
    }
}