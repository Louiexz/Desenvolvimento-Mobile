package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button btn_toast_um = findViewById(R.id.btn_toast_um);
        btn_toast_um.setOnClickListener(v -> Toast.makeText(TesteActivity.this, "Toast um clicado!", Toast.LENGTH_SHORT).show());

        Button btn_toast_dois = findViewById(R.id.btn_toast_dois);
        btn_toast_dois.setOnClickListener(v -> Toast.makeText(TesteActivity.this, "Toast dois clicado!", Toast.LENGTH_SHORT).show());

        Button btn_back = findViewById(R.id.btn_teste_back);
        btn_back.setOnClickListener(v -> {
            Intent intent = new Intent(TesteActivity.this,
                    MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}