package com.example.ejercicio1_ajimenez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FuncionesMatematicas extends AppCompatActivity {
    int num1, num2, result;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular);

        num1 = Integer.parseInt(findViewById(R.id.Num1).toString());
        num2 = Integer.parseInt(findViewById(R.id.Numb2).toString());
        btnSuma = (Button) findViewById(R.id.btnSumar);
        btnResta = (Button) findViewById(R.id.btnRestar);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicar);
        btnDivision = (Button) findViewById(R.id.btnDividir);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = sumar(num1, num2);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = restar(num1, num2);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = multiplicar(num1, num2);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = dividir(num1, num2);
            }
        });
    }

    //Función de suma
    private int sumar(int num1, int num2) {
        return num1 + num2;
    }

    //Función de resta
    private int restar(int num1, int num2) {
        return num1 + num2;
    }

    //Función de multiplicar
    private int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    //Función de dividir
    private int dividir(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            // Manejo de división por cero
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }

    private void EnviarResultado() {

        Intent intent = new Intent(FuncionesMatematicas.this, Resultados.class);
        intent.putExtra("dato", result);
        startActivity(intent);
    }
}
