package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv = findViewById(R.id.kiir);
        TextView tv2 = findViewById(R.id.kiir2);
        Button gomb = findViewById(R.id.Gomb);

        Bundle extras = getIntent().getExtras();

        if (extras !=null) {
            tv.setText("Köszönjük a regisztrációját"+extras.getString("Nev"));
            tv2.setText("rögzitésre kerult az életkora "+extras.getString("Kor")+"év És személyi száma: "+extras.getString("Szig"));
        }

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultActivity = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(resultActivity);
            }
        });
    }
}