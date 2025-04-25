package com.example.myapplication.platafomaeducacional;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.platafomaeducacional.interacao.Plataforma;

import com.example.myapplication.platafomaeducacional.excecao.LimiteMaximoInscricoesException;

public class PlataformaDigitalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataforma_digital);

        Plataforma plataforma = new Plataforma();

        plataforma.NovoAluno("Joao", "123!a", "example@gmail.com");
        plataforma.getAluno("Joao");

        plataforma.NovoCurso(1200, 100, "UNIT", "ADS");
        plataforma.getCurso("ADS");

        try {
            plataforma.InscreverAluno("Joao", "ADS");
        } catch (LimiteMaximoInscricoesException e) {
            throw new RuntimeException(e);
        }

        Button button_ptf = findViewById(R.id.btn_pfd_back);
        button_ptf.setOnClickListener(v -> {
            Intent intent = new Intent(PlataformaDigitalActivity.this,
                    MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
