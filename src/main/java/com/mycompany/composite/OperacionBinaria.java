package com.mycompany.composite;

public abstract class OperacionBinaria implements Expresion{
    
    protected Expresion izquierda;
    protected Expresion derecha;
    
    public OperacionBinaria(Expresion izquierda, Expresion derecha){
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
    protected abstract String obtenerOperador ();
    
    @Override
    public String print(){
        return "("+izquierda.print()+" "+obtenerOperador()+" "+derecha.print()+")";
    }
}