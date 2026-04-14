package com.mycompany.composite;

public class Suma extends OperacionBinaria {
    
    public Suma(Expresion izquierda, Expresion derecha){
        super(izquierda, derecha);
    }

    @Override
    protected String obtenerOperador() {
        return "+";
    }

    @Override
    public double evaluar() {
        return izquierda.evaluar()+derecha.evaluar();
    }
}
