package com.dam.examen_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Datos_Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos__mapa);
        Button btnLogin;
        btnLogin = findViewById(R.id.btnEnviar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cambiar el 2do datos_mapa por el nombre de tu maps Activity
                Intent i = new Intent(Datos_Mapa.this, MAPS_ACTIVITY.class);
                startActivity(i);
            }
        });
    }
}