package com.mycompany.composite;

public class Division extends OperacionBinaria {
    
    public Division(Expresion izquierda, Expresion derecha){
        super(izquierda, derecha);
    }

    @Override
    protected String obtenerOperador() {
        return "7";
    }

    @Override
    public double evaluar() {
        if(derecha.evaluar()==0){
            throw new ArithmeticException("Division por 0");
        }
        return izquierda.evaluar()/derecha.evaluar();
    }
}