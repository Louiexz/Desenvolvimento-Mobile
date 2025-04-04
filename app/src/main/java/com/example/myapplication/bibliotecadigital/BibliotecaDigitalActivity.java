package com.example.myapplication.bibliotecadigital;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.bibliotecadigital.classe.Biblioteca;

public class BibliotecaDigitalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca_digital);

        Biblioteca biblio = new Biblioteca();

        biblio.cadastrarAluno("Joao", "123a!",
                "ADS", "example@gmail.com");
        biblio.autenticarAluno("Joao", "123a!");
        biblio.getAluno("Joao");

        biblio.novoLivro("Harry Potter", "C.S Lewis",
                "fantasia", 2008);
        biblio.buscarLivros("Harry Potter");

        biblio.novoEmprestimo("Joao", "Harry Potter");
        biblio.devolverEmprestimo("Joao", "Harry Potter");

        Button button = findViewById(R.id.btn_bbt_back);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(BibliotecaDigitalActivity.this,
                    MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
