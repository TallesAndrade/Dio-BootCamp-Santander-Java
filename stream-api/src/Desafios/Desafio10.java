package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 17, 13, 5, 6, 11);
        List<Integer> numerosMultiplos5e3 = numeros
                .stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        System.out.println(numerosMultiplos5e3);
    }

}
