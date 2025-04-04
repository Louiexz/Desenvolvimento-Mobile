package com.example.myapplication.gerenciaeletronicos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class EletronicosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronicos);

        Button btn_new_computer = findViewById(R.id.btn_new_computer);
        btn_new_computer.setOnClickListener(v -> {
            Computador pc = new Computador(
                    Integer.parseInt(String.valueOf(findViewById(R.id.eletronico_ano))),
                    String.valueOf(findViewById(R.id.eletronico_marca)),
                    String.valueOf(findViewById(R.id.eletronico_modelo)));

            Toast.makeText(EletronicosActivity.this, "Computador cadastrado!", Toast.LENGTH_SHORT).show();
            pc.GetInformation();
        });

        Button btn_new_cell = findViewById(R.id.btn_new_cell);
        btn_new_cell.setOnClickListener(v -> {
            Smartphone cell = new Smartphone(
                    Integer.parseInt(String.valueOf(findViewById(R.id.eletronico_ano))),
                    String.valueOf(findViewById(R.id.eletronico_marca)),
                    String.valueOf(findViewById(R.id.eletronico_modelo)));

            Toast.makeText(EletronicosActivity.this, "Celular cadastrado!", Toast.LENGTH_SHORT).show();
            cell.GetInformation();
        });

        Button button = findViewById(R.id.btn_eletro_back);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(EletronicosActivity.this, MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
