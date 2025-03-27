package com.example.myapplication.gerenciaveiculos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class VeiculosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculos);

        Carro car = new Carro("Uno", "Fiat", 2004);
        car.toString();

        Moto bike = new Moto("Start", "Honda", 2024);
        bike.toString();

        Onibus bus = new Onibus("Sprinter", "Mercedez bens", 2024);
        bus.toString();

        CarroEletrico eletricCar = new CarroEletrico("Y", "Tesla", 2024);
        eletricCar.toString();
    }
}
