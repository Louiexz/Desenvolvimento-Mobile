package com.example.myapplication.gerenciaveiculos;

public abstract class Veiculos {
    public String toString() {
        return "" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", combustivel=" + combustivel +
                ", qtdMaximaCombustivel=" + qtdMaximaCombustivel +
                ", qtdMarcha=" + qtdMarcha +
                ", capacidadeMotor=" + capacidadeMotor +
                ", potencia=" + potencia +
                ", ano=" + ano +
                '}';
    }

    protected String modelo;
    protected String marca;
    protected double combustivel = 0.0;
    protected double qtdMaximaCombustivel = 0.0;
    protected int qtdMarcha = 0;
    protected double capacidadeMotor = 0.0;
    protected int potencia = 0;
    protected int ano = 0;

    protected abstract String buzinar();
    protected abstract String ligar();
    protected abstract String desligar();
    protected abstract int getQtdRodas();

    protected double getCombustivel() {
        return combustivel;
    }

    protected void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    protected int getQtdMarcha() {
        return qtdMarcha;
    }

    protected void setQtdMarcha(int qtdMarcha) {
        this.qtdMarcha = qtdMarcha;
    }

    protected void reabastecer(double qtdReabastecimento){
        if (combustivel + qtdReabastecimento < qtdMaximaCombustivel){
            this.combustivel += qtdReabastecimento;
        };
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected double getCombustivelAtual() {
        return combustivel;
    }

    protected double getQtdMaximaCombustivel() {
        return qtdMaximaCombustivel;
    }

    protected void setQtdMaximaCombustivel(double qtdMaximaCombustivel) {
        this.qtdMaximaCombustivel = qtdMaximaCombustivel;
    }

    protected double getCapacidadeMotor() {
        return capacidadeMotor;
    }

    protected void setCapacidadeMotor(double capacidadeMotor) {
        this.capacidadeMotor = capacidadeMotor;
    }

    protected int getPotencia() {
        return potencia;
    }

    protected void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    protected int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }
}
