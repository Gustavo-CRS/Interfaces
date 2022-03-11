package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Cilindro implements FiguraGeometricaDefault {

    private int altura, largura, raio;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
        setRaio(largura/2);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "Cilindro";
    }

    @Override
    public int getArea() {
        return (int) (2*Math.PI*getRaio()*(getRaio() + getAltura()));
    }

    @Override
    public int getPerimetro() {
        return (int) ((2*Math.PI)*raio);
    }

    @Override
    public void getRetornaNada() {
        System.out.println("Valores Cilindro");
    }
}