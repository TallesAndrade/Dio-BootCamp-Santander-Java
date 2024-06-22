package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-11, -22, -40, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean numerosPositivos = numeros.stream().allMatch(n -> n > 0);

        if (numerosPositivos) {
            System.out.print(numeros);
        }else {
            System.out.println("Existem numeros negativos");
        }


    }
}
