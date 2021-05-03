package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Alkohol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkohol);

        Button Rendelogomb = findViewById(R.id.Rendel);
        EditText beer = findViewById(R.id.Beerdb);
        EditText wine = findViewById(R.id.Winedb);
        EditText palinka = findViewById(R.id.Palinkadb);
        EditText vevonev = findViewById(R.id.Vevo);


        Rendelogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Alkohol.this, Megrendeles.class);
                int vegosszeg = Integer.parseInt(beer.getText().toString())*300+
                        Integer.parseInt(wine.getText().toString())*700+
                        Integer.parseInt(palinka.getText().toString())*2500;
                i.putExtra("osszeg", vegosszeg);
                i.putExtra("nev",vevonev.getText().toString());
                startActivity(i);
            }
        });

    }
}