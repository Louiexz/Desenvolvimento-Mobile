package com.example.myapplication.gerenciaeletronicos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class EletronicosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronicos);

        Computador pc = new Computador(2024, "Samsung", "Galaxy Book4");
        pc.GetInformation();

        Smartphone celular = new Smartphone(2018, "Motorola", "Moto g6");
        celular.GetInformation();

        Button button = findViewById(R.id.btn_eletro_back);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(EletronicosActivity.this, MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
