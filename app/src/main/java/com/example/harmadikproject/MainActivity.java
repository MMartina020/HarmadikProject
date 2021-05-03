package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Gomb = findViewById(R.id.Gomb);
        Button Gombpia = findViewById(R.id.pia);


        Gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultActivity = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(resultActivity);
            }
        });
        Gombpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                Intent alcohol = new Intent(MainActivity.this, Alkohol.class);
                startActivity(alcohol);
            }
        });
    }
}