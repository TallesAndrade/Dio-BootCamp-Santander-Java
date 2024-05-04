package edu.talles.operadores;

public class OperadorTernario {
    public static void main(String[] args) {

        // classe Operadores.java
        int a, b;

        a = 6;
        b = 6;

        String valor = "";

        if(a==b)
            valor = "verdadeiro";
        else
            valor = "falso";

        System.out.println(valor);

        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

    }
}
