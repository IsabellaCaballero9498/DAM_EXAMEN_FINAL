package com.dam.examen_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
                //startActivity(i);
                i.setData(Uri.parse("geo:-12.21423900632063, -76.93274536779899"));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });
    }
}