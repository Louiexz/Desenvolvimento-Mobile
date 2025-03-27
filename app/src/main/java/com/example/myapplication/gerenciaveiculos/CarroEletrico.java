package com.example.myapplication.gerenciaveiculos;

public class CarroEletrico extends Veiculos {
    @Override
    public String toString() {
        return "CarroEletrico{" + super.toString();
    }

    public CarroEletrico(double combustivel, int qtdMarcha, String modelo, String marca,
                         double qtdMaximaCombustivel, double capacidadeMotor, int potencia, int ano) {
        super.setCombustivel(combustivel);
        super.setQtdMarcha(qtdMarcha);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setQtdMaximaCombustivel(qtdMaximaCombustivel);
        super.setCapacidadeMotor(capacidadeMotor);
        super.setPotencia(potencia);
        super.setAno(ano);
    }
    public CarroEletrico(String modelo, String marca, int ano) {
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setAno(ano);
    }
    @Override
    protected double getCombustivel() {
        return super.getCombustivel();
    }

    @Override
    protected void setCombustivel(double combustivel) {
        super.setCombustivel(combustivel);
    }

    @Override
    protected int getQtdMarcha() {
        return super.getQtdMarcha();
    }

    @Override
    protected void setQtdMarcha(int qtdMarcha) {
        super.setQtdMarcha(qtdMarcha);
    }

    @Override
    protected void reabastecer(double qtdReabastecimento) {
        super.reabastecer(qtdReabastecimento);
    }

    @Override
    protected String getModelo() {
        return super.getModelo();
    }

    @Override
    protected void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    protected String getMarca() {
        return super.getMarca();
    }

    @Override
    protected void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    protected double getCombustivelAtual() {
        return super.getCombustivelAtual();
    }

    @Override
    protected double getQtdMaximaCombustivel() {
        return super.getQtdMaximaCombustivel();
    }

    @Override
    protected void setQtdMaximaCombustivel(double qtdMaximaCombustivel) {
        super.setQtdMaximaCombustivel(qtdMaximaCombustivel);
    }

    @Override
    protected double getCapacidadeMotor() {
        return super.getCapacidadeMotor();
    }

    @Override
    protected void setCapacidadeMotor(double capacidadeMotor) {
        super.setCapacidadeMotor(capacidadeMotor);
    }

    @Override
    protected int getPotencia() {
        return super.getPotencia();
    }

    @Override
    protected void setPotencia(int potencia) {
        super.setPotencia(potencia);
    }
    @Override
    protected int getAno() {
        return super.getAno();
    }

    @Override
    protected void setAno(int ano) {
        super.setAno(ano);
    }

    @Override
    public String ligar() {
        return "Carro elétrico ligado.";
    }

    @Override
    public String desligar() {
        return "Carro elétrico desligado.";
    }
    @Override
    protected String buzinar() {
        return "Peeep";
    }
    @Override
    public int getQtdRodas() {
        return 4;
    }
}
