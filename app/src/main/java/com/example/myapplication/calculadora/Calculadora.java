package com.example.myapplication.calculadora;

import android.util.Log;

public class Calculadora implements ICalculadora {
    @Override
    public void dividir(double dividendo, double divisor) {
        Log.i("Resultado da divisão: ", String.valueOf(dividendo + divisor));
    }

    @Override
    public void subtrair(double minuendo, double subtraendo) {
        Log.i("Resultado da subtração: ", String.valueOf(minuendo + subtraendo));
    }

    @Override
    public void somar(double parcela_um, double parcela_dois) {
        Log.i("Resultado da divisão: ", String.valueOf(parcela_um + parcela_dois));
    }

    @Override
    public void multiplicar(double fator_um, double fator_dois) {
        Log.i("Resultado da divisão: ", String.valueOf(fator_um + fator_dois));
    }
}
