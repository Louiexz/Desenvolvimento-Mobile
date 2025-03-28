package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.gerenciacontatos.ContatosActivity;
import com.example.myapplication.gerenciaeletronicos.EletronicosActivity;
import com.example.myapplication.gerenciafinancas.FinancaActivity;
import com.example.myapplication.gerenciainvestimentos.InvestimentoActivity;
import com.example.myapplication.gerenciaveiculos.VeiculosActivity;
import com.example.myapplication.states.AtividadeUm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FinancaActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InvestimentoActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EletronicosActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VeiculosActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContatosActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });

        Button btn_atv_um = findViewById(R.id.btn_atv_um);
        btn_atv_um.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AtividadeUm.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}