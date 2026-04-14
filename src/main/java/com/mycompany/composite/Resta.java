package com.mycompany.composite;

public class Resta extends OperacionBinaria {
    
    public Resta(Expresion izquierda, Expresion derecha){
        super(izquierda, derecha);
    }

    @Override
    protected String obtenerOperador() {
        return "-";
    }

    @Override
    public double evaluar() {
        return izquierda.evaluar()-derecha.evaluar();
    }
}