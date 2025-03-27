package com.example.myapplication.gerenciafinancas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FinancaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financas);

        GerenciaFinanca gerenciador = new GerenciaFinanca();

        gerenciador.NovaTransacao("Despesa", "1000", "tela");
        gerenciador.NovaTransacao("Receita", "1000", "venda de tela");
        gerenciador.CalcularSaldo();
        gerenciador.GetTodasTransacoes();
        gerenciador.DeletarTransacao("tela");
    }
}
