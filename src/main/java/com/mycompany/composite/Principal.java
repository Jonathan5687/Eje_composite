package com.mycompany.composite;

public class Principal {
    public static void main(String[] args) {

        Expresion expr =
            new Multiplicacion(
                new Suma(new Numero(90), new Numero(3)),
                new Resta(new Numero(10), new Numero(2))
            );

        System.out.println("Expresión: " + expr.print());
        System.out.println("Resultado: " + expr.evaluar());

        System.out.println("\nÁrbol:");
        PrintArbol.print(expr, "", false);
    }
}