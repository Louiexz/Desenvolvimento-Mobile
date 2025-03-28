package com.example.myapplication.gerenciacontatos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class ContatosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);

        InteracaoGerenciaContatos gerenciador = new InteracaoGerenciaContatos();

        Pessoal gerenciadorPessoal = new Pessoal();
        gerenciadorPessoal.novoContato("João", "81 2222-1111", "Pessoal");

        Profissional gerenciadorProfissional = new Profissional();
        gerenciadorPessoal.novoContato("Maria", "81 1111-1111", "Profissional");

        gerenciador.TodosOsContatosPorTipo("Profissional");
        gerenciador.TodosOsContatos();
        gerenciador.deletarContato("Maria");
        gerenciador.procurarContato("João");

        Button button = findViewById(R.id.btn_ctt_back);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(ContatosActivity.this, MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
