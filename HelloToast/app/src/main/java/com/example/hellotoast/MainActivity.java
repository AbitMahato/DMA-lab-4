package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    private int mCount = 0;
    private TextView mShowCount;
    private Button Toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }



    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void secondactivity(View view) {
        Intent i = new Intent(this, secondactivity.class);
        String passedMessage = mShowCount.getText().toString();
        i.putExtra(EXTRA_MESSAGE, passedMessage);

        startActivity(i);
    }
}