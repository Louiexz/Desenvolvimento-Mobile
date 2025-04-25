package com.example.myapplication.states;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class AtividadeDois extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_dois);

        Log.d(TagDeRegistro.LOG_TAG_UI, "Criacao da atividade normal.");

        Button btn_back = findViewById(R.id.btn_dois_back);
        btn_back.setOnClickListener(v -> {
            Intent intent = new Intent(AtividadeDois.this, AtividadeUm.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStart(){
        super.onStart();
        TextView tv = findViewById(R.id.textView3);
        Log.d(TagDeRegistro.LOG_TAG_UI, "Inicio da atividade normal");
        tv.setText("onStart(): Inicio da atividade normal");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Parada da atividade normal");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Destruindo atividade normal");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Pausa da atividade normal");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Resumo da atividade normal");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Reinicio da atividade normal");
    }
}