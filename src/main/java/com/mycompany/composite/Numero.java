package com.mycompany.composite;

public class Numero implements Expresion {

    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double evaluar() {
        return valor;
    }
    
    @Override
    public String print(){
        return String.valueOf(valor);
    }
}