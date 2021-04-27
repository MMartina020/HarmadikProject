package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev = findViewById(R.id.nev);
        EditText szul= findViewById(R.id.szul);
        EditText szig= findViewById(R.id.szig);

        Button tovabbitas = findViewById(R.id.tovabbitas);

        tovabbitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                String atadandoSzoveg = nev.getText().toString();
                i.putExtra("Nev:", atadandoSzoveg);

                String atadandoSzoveg2 = nev.getText().toString();
                i.putExtra("Szül.datum:", atadandoSzoveg2);

                String atadandoSzoveg3 = nev.getText().toString();
                i.putExtra("Szig.száma::", atadandoSzoveg3);

                startActivity(i);
            }
        });
    }
}

