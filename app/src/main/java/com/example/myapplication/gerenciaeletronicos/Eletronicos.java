package com.example.myapplication.gerenciaeletronicos;

import android.util.Log;

public abstract class Eletronicos {

    public void GetInformations(String eletronico) {
        Log.i(eletronico,
                "capacidadeBateria=" + capacidadeBateria +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", tamanhoTela=" + tamanhoTela +
                ", capacidadeRam=" + capacidadeRam +
                ", capacidadeMemoria=" + capacidadeMemoria);
    }

    protected int capacidadeBateria;
    public abstract String getInput();
    public abstract int getCapacidadeBateria();
    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getCapacidadeRam() {
        return capacidadeRam;
    }

    public void setCapacidadeRam(int capacidadeRam) {
        this.capacidadeRam = capacidadeRam;
    }

    public int getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    protected String modelo;
    protected String marca;
    protected int ano;
    protected double tamanhoTela;
    protected int capacidadeRam;
    protected int capacidadeMemoria;
}