package com.example.myapplication.calculadora;

import android.util.Log;

import java.util.Objects;

public class Calculadora implements ICalculadora {
    @Override
    public double dividir(double dividendo, double divisor) {
        try {
            // Check if the divisor is zero to avoid division by zero error
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            // Check if the divisor is between -1 and 1, as per your original condition
            if (divisor > -1 && divisor < 1) {
                throw new IllegalArgumentException("Divisor must not be between -1 and 1.");
            }

            double resultado = dividendo / divisor;
            Log.i("Resultado da divisão: ", String.valueOf(resultado));
            return resultado;

        } catch (ArithmeticException e) {
            // Handle division by zero
            Log.e("Erro de divisão", Objects.requireNonNull(e.getMessage()));
            throw e;  // Rethrow the exception after logging it
        } catch (IllegalArgumentException e) {
            // Handle invalid divisor range
            Log.e("Erro de parâmetro", Objects.requireNonNull(e.getMessage()));
            throw e;  // Rethrow the exception after logging it
        }
    }

    @Override
    public double subtrair(double minuendo, double subtraendo) {
        double resultado = minuendo - subtraendo;
        Log.i("Resultado da subtração: ", String.valueOf(resultado));
        return resultado;
    }

    @Override
    public double somar(double parcela_um, double parcela_dois) {
        double resultado = parcela_um + parcela_dois;
        Log.i("Resultado da divisão: ", String.valueOf(resultado));
        return resultado;
    }

    @Override
    public double multiplicar(double fator_um, double fator_dois) {
        double resultado = fator_um * fator_dois;
        Log.i("Resultado da divisão: ", String.valueOf(resultado));
        return resultado;
    }
}
