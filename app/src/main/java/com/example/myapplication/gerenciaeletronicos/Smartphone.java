package com.example.myapplication.gerenciaeletronicos;

public class Smartphone extends Eletronicos{
    public void GetInformation() {
        super.GetInformations("Smartphone");
    }

    public Smartphone(int ano, String marca, String modelo) {
        super.setAno(ano);
        super.setMarca(marca);
        super.setModelo(modelo);
    }
    public Smartphone(){}
    @Override
    public void setCapacidadeBateria(int capacidadeBateria) {
        super.setCapacidadeBateria(capacidadeBateria);
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
        return "Toque";
    }

    @Override
    public int getCapacidadeBateria() {
        return super.capacidadeBateria;
    }
}
