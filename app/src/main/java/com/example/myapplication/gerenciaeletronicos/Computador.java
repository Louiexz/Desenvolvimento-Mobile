package com.example.myapplication.gerenciaeletronicos;

public class Computador extends Eletronicos{
    public Computador(int ano, String marca, String modelo) {
        super.setAno(ano);
        super.setMarca(marca);
        super.setModelo(modelo);
    }
    public Computador(){}

    @Override
    public void setCapacidadeBateria(int capacidadeBateria) {
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    @Override
    public double getTamanhoTela() {
        return super.getTamanhoTela();
    }

    @Override
    public void setTamanhoTela(double tamanhoTela) {
        super.setTamanhoTela(tamanhoTela);
    }

    @Override
    public int getCapacidadeRam() {
        return super.getCapacidadeRam();
    }

    @Override
    public void setCapacidadeRam(int capacidadeRam) {
        super.setCapacidadeRam(capacidadeRam);
    }

    @Override
    public int getCapacidadeMemoria() {
        return super.getCapacidadeMemoria();
    }

    @Override
    public void setCapacidadeMemoria(int capacidadeMemoria) {
        super.setCapacidadeMemoria(capacidadeMemoria);
    }

    @Override
    public String getInput() {
        return "Mouse + Teclado";
    }

    @Override
    public int getCapacidadeBateria() {
        return 0;
    }
}
