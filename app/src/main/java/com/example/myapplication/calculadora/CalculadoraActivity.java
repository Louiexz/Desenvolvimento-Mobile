package com.example.myapplication.calculadora;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Componentes de UI em memória
        // Criar: EditText; Layout; TextView; Button. Obs: sem xml
        
        Calculadora calc = new Calculadora();

        calc.somar(1, 1);
        calc.dividir(10, 10);
        calc.subtrair(100, 1000);
        calc.multiplicar(5, 8);
    }
}