package com.mycompany.composite;


public class PrintArbol {

    public static void print(Expresion expr, String prefijo, boolean esIzquierda) {
        if (expr instanceof OperacionBinaria) {
            
            OperacionBinaria op = (OperacionBinaria) expr;
            System.out.println(prefijo + (esIzquierda ? "    " : "    ") + op.getClass().getSimpleName());

            print(op.izquierda, prefijo + (esIzquierda ? "    " : "    "), true);
            print(op.derecha, prefijo + (esIzquierda ? "    " : "    "), false);
        } else {
            System.out.println(prefijo + (esIzquierda ? "    " : "    ") + expr.print());
        }
    }
}