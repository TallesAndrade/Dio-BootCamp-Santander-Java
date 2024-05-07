package edu.talles.operadores;

public class Relacionais {

    public static void main(String[] args) {
        String nomeUm = "Talles";
        String nomeDois = new String("Talles");

        System.out.println(nomeUm.equals(nomeDois));
        int numero1 = 2;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

    }
}
