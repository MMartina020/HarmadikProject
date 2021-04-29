package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Gomb = findViewById(R.id.Gomb);


        Gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultActivity = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(resultActivity);
            }
        });
    }
}