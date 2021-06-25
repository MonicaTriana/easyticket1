package com.example.easyticket1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class config_activity extends AppCompatActivity {
TextView txt;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        txt = findViewById(R.id.general);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cuenta_activity.class);
                startActivity(intent);
            }
        });

        img = findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menu_activity.class);
                startActivity(intent);
            }
        });

        img = findViewById(R.id.ajustes);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cuenta_activity.class);
                startActivity(intent);
            }
        });

        img = findViewById(R.id.search);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BuscarProducto_activity.class);
                startActivity(intent);
            }
        });
    }
}