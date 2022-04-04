package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Intent i = getIntent();
        String message = i.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview = findViewById(R.id.textView2);
        textview.setText(message);
    }
}