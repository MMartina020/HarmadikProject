package com.example.harmadikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Megrendeles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_megrendeles);

        TextView szovegkiir = findViewById(R.id.megrendeles);
        Button home = findViewById(R.id.vissza);

        Bundle extras = getIntent().getExtras();

        if (extras !=null) {
            szovegkiir.setText("Köszönjük a megrendelését "+extras.getString("nev")+
                    " A fizetendő végösszeg: : "+extras.getInt("osszeg"));
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultActivity = new Intent(Megrendeles.this, MainActivity.class);
                startActivity(resultActivity);
            }
        });
    }
}
