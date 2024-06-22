package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 17, 13, 5, 6, 11);

        List<Integer> numerosSemDuplicados = numeros.stream()
                .distinct()
                .toList();

        OptionalInt maiorPrimo = numerosSemDuplicados.stream()
                .filter(Desafio14::isPrimo)
                .mapToInt(Integer::intValue)
                .max();

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo encontrado: " + maiorPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        return n > 1 && IntStream.range(2, n)
                .noneMatch(i -> n % i == 0);
    }
}
