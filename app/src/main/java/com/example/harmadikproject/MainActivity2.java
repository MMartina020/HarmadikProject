package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText nevk = findViewById(R.id.nev);
        EditText szulk= findViewById(R.id.szul);
        EditText szigk= findViewById(R.id.szig);

        Button Tovabbitas = findViewById(R.id.gomb2);

        Tovabbitas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent k = new Intent(MainActivity2.this,
                        MainActivity3.class);
                k.putExtra("Nev", nevk.getText().toString());

                int atad = 2021 - Integer.parseInt(szulk.getText().toString().substring(0, 4));
                k.putExtra("Kor", atad);

                k.putExtra("Szig", szigk.getText().toString());
                startActivity(k);
            }}
        );
    }
}

