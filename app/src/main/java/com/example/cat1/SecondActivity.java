package com.example.cat1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Set text to the TextView in this activity
        TextView textView = findViewById(R.id.textView);
        textView.setText(R.string.welcome_message);
    }
}
