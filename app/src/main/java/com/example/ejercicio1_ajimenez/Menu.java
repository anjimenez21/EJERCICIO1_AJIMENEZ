package com.example.ejercicio1_ajimenez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    Button btnCalcularr, btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        btnCalcularr = (Button) findViewById(R.id.btnCalculadora);
        btnResult = (Button) findViewById(R.id.btnSumar);

        btnCalcularr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FuncionesMatematicas.class);
                startActivity(intent);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Resultados.class);
                startActivity(intent);
            }
        });

    }

}
