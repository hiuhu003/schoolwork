package com.example.cat1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            //button to other activity
            Button firstButton = findViewById(R.id.firstButton);
            firstButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
            });

            //second button to open www.kca.ac.ke
            Button secondButton = findViewById(R.id.secondButton);
            secondButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kca.ac.ke"));
                    startActivity(browserIntent);
                }
            });
    }
}