package com.mycompany.composite;

public class Multiplicacion extends OperacionBinaria {
    
    public Multiplicacion(Expresion izquierda, Expresion derecha){
        super(izquierda, derecha);
    }

    @Override
    protected String obtenerOperador() {
        return "*";
    }

    @Override
    public double evaluar() {
        return izquierda.evaluar()*derecha.evaluar();
    }
}