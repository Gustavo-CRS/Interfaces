package com.sovos.figurageometrica.figuras;


import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Circulo implements FiguraGeometricaDefault {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "circulo";
    }

    @Override
    public int getArea() {
        return (int)(Math.PI*(Math.pow(getRaio(),2)));
    }

    @Override
    public int getPerimetro() {
        return (int) ((2*Math.PI)*raio);
    }

    @Override
    public void getRetornaNada() {
        System.out.println("Valores do meu Circulo");
    }
}