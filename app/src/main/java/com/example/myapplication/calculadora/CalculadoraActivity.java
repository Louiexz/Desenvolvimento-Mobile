package com.example.myapplication.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;

public class CalculadoraActivity extends AppCompatActivity {

    public double pegarResultado(String num){
        return Double.parseDouble(num);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Componentes de UI em memória
        // Criar: EditText; Layout; TextView; Button. Obs: sem xml

        Calculadora calc = new Calculadora();

        LinearLayout linear = new LinearLayout(this);

        TextView titleTextView = new TextView(this);
        titleTextView.setText("Calculadora");
        titleTextView.setTextSize(18);

        LinearLayout linearEditText = new LinearLayout(this);

        linearEditText.setOrientation(LinearLayout.HORIZONTAL);

        TextView numUmText = new TextView(this);
        numUmText.setText("Digite um número: ");

        EditText numUmEditText = new EditText(this);
        numUmEditText.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView numDoisText = new TextView(this);
        numDoisText.setText("Digite outro número: ");

        EditText numDoisEditText = new EditText(this);
        numDoisEditText.setInputType(InputType.TYPE_CLASS_NUMBER);

        linearEditText.addView(numUmText);
        linearEditText.addView(numUmEditText);
        linearEditText.addView(numDoisText);
        linearEditText.addView(numDoisEditText);

        Button somar = new Button(this);
        somar.setText("Somar");

        somar.setOnClickListener(v -> {
            double numUm = pegarResultado(numUmEditText.getText().toString());
            double numDois = pegarResultado(numDoisEditText.getText().toString());
            double resultado = calc.somar(numUm, numDois);
            Toast.makeText(this, "Resultado da soma: " + resultado, Toast.LENGTH_SHORT).show();
        });

        Button multiplicacao = new Button(this);
        multiplicacao.setText("Multiplicar");

        multiplicacao.setOnClickListener(v -> {
            double numUm = pegarResultado(numUmEditText.getText().toString());
            double numDois = pegarResultado(numDoisEditText.getText().toString());
            double resultado = calc.multiplicar(numUm, numDois);
            Toast.makeText(this, "Resultado da multiplicação: " + resultado, Toast.LENGTH_SHORT).show();
        });

        Button divisao = new Button(this);
        divisao.setText("Dividir");

        divisao.setOnClickListener(v -> {
            double numUm = pegarResultado(numUmEditText.getText().toString());
            double numDois = pegarResultado(numDoisEditText.getText().toString());
            try {
                double resultado = calc.dividir(numUm, numDois);
                Toast.makeText(this, "Resultado da divisão: " + resultado, Toast.LENGTH_SHORT).show();
            } catch (Exception e){
                Toast.makeText(this, "Erro: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        });

        Button subtracao = new Button(this);
        subtracao.setText("Subtrair");

        subtracao.setOnClickListener(v -> {
            double numUm = pegarResultado(numUmEditText.getText().toString());
            double numDois = pegarResultado(numDoisEditText.getText().toString());
            double resultado = calc.subtrair(numUm, numDois);
            Toast.makeText(this, "Resultado da subtração: " + resultado, Toast.LENGTH_SHORT).show();
        });

        Button back = new Button(this);
        back.setText("Back");

        back.setOnClickListener(v -> {
            Intent intent = new Intent(CalculadoraActivity.this,
                    MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        linear.addView(titleTextView);

        linear.addView(linearEditText);

        linear.addView(somar);
        linear.addView(subtracao);
        linear.addView(multiplicacao);
        linear.addView(divisao);
        linear.addView(back);

        linear.setOrientation(LinearLayout.VERTICAL);
        setContentView(linear);
    }
}