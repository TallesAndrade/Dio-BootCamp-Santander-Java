package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 17, 13, 5, 6, 11);
        Long produtoFinal = numeros.stream()
                .map(Long::valueOf)
                .reduce(1L, (a, b) -> a * b);
        System.out.println(produtoFinal);

    }
}
