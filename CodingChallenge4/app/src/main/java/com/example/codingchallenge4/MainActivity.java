package com.example.codingchallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.coddingchallenge";
    Button buttonOne,buttonTwo,buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne =findViewById(R.id.buttonOne) ;
        buttonTwo =findViewById(R.id.buttonTwo) ;
        buttonThree =findViewById(R.id.buttonThree) ;
    }
    public void buttonOne(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonOne.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void buttonTwo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonTwo.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void buttonThree(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonThree.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}