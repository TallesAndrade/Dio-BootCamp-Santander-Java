package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 17, 13, 5, 6, 11);
        boolean numerosIguais =numeros.stream()
                .distinct()
                .limit(2)
                .count()<=1;

        if (numerosIguais){
            System.out.println("Existem nuemros iguais na lista");
        }else{
            System.out.println("Não existem numeros iguais na lista");
        }
    }


}
