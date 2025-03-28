package com.example.myapplication.states;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class AtividadeDois extends AppCompatActivity {
    TextView tv = findViewById(R.id.textView3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_dois);

        Log.d(TagDeRegistro.LOG_TAG_UI, "Criacao da atividade normal.");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Inicio da atividade normal");
        tv.setText("onStart(): Inicio da atividade principal");
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