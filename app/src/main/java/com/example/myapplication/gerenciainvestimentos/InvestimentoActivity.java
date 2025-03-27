package com.example.myapplication.gerenciainvestimentos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class InvestimentoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investimentos);

        InteracaoGerenciaInvestimento gerenciador = new InteracaoGerenciaInvestimento();

        gerenciador.NovoInvestimento("Bitcoin", "1000");
        gerenciador.GetInvestimentos();
        gerenciador.GetInvestimentosPorTipo("Bitcoin");
        gerenciador.totalRetorno();
        gerenciador.DeletarInvestimento("Bitcoin", "1000");
    }
}
