package com.example.myapplication.gerenciaeletronicos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class EletronicosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronicos);

        Computador pc = new Computador(2024, "Samsung", "Galaxy Book4");

        Smartphone celular = new Smartphone(2018, "Motorola", "Moto g6");
    }
}
