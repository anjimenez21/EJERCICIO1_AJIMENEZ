package com.example.ejercicio1_ajimenez;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Resultados extends AppCompatActivity {
    private String dato;
    EditText resultado;


    public Resultados() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        //Obtener el dato enviado desde funciones matematicas
        Bundle result = getIntent().getExtras();
        if (result != null) {
            dato = result.getString("dato");
        }

        // Utilizar el dato como desees
        if (dato != null) {
            resultado = findViewById(R.id.Numero1);
            resultado.setText(dato);


        }

    }


}
