package edu.talles.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = +numero;

        System.out.println(numero);

        numero = numero*-1;

        System.out.println(numero);

        numero ++;
        System.out.println(numero);

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }
}
