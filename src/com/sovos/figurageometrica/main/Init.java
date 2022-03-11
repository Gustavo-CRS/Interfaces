package com.sovos.figurageometrica.main;

import com.sovos.figurageometrica.figuras.Quadrado;

public class Init {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
        quadrado.getRetornaNada();

    }
}
