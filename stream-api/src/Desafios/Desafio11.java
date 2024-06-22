package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 17, 13, 5, 6, 11);
        int somaQuadrado =numeros.stream()
                .mapToInt(n->n*n)
                .sum();
        System.out.println(somaQuadrado);
    }
}
