package com.example.myapplication.gerenciaveiculos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class VeiculosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculos);

        Carro car = new Carro("Uno", "Fiat", 2004);
        car.GetInformation();

        Moto bike = new Moto("Start", "Honda", 2024);
        bike.GetInformation();

        Onibus bus = new Onibus("Sprinter", "Mercedez bens", 2024);
        bus.GetInformation();

        CarroEletrico eletricCar = new CarroEletrico("Y", "Tesla", 2024);
        eletricCar.GetInformation();

        Button button = findViewById(R.id.btn_vei_back);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(VeiculosActivity.this, MainActivity.class);
            startActivity(intent); // Inicia a nova Activity
        });
    }
}
