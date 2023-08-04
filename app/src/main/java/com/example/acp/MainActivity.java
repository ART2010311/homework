package com.example.acp;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;


import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(view ->{
            Log.d("MainActivity","Button is clicked");
        });
    }
}