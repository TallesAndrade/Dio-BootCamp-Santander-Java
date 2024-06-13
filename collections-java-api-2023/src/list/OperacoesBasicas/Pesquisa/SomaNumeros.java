package list.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> ListaNumeros;

    public SomaNumeros(){
        ListaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int... numeros){

        for (int numero : numeros) {
            ListaNumeros.add(numero);
        }
    }

    public void calcularSoma() {
        int somaTotal = 0;
        for (Integer numero : ListaNumeros) {
            somaTotal += numero;
        }
        System.out.println("A soma total dos números é: " + somaTotal);
    }

    public void encontrarNumeroMaior() {
        if (ListaNumeros.isEmpty()) {
            throw new ListaVaziaException("A lista está vazia. Não é possível encontrar o maior número.");
        }
        int numeroMaior = ListaNumeros.get(0);
        for (Integer numero : ListaNumeros) {
            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
        }
        System.out.println("O maior número da lista é: " + numeroMaior);
    }

    public void encontrarNumeroMenor() {
        if (ListaNumeros.isEmpty()) {
            throw new ListaVaziaException("A lista está vazia. Não é possível encontrar o menor número.");
        }
        int numeroMenor = ListaNumeros.get(0);
        for (Integer numero : ListaNumeros) {
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("O menor número da lista é: " + numeroMenor);
    }

    public void exibirNumeros() {
        if (ListaNumeros.isEmpty()) {
            throw new ListaVaziaException("A lista está vazia.");
        }
        System.out.print("Esses são os números da lista: " + this.ListaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(15,40,35,10,90,100);
        somaNumeros.calcularSoma();
        somaNumeros.encontrarNumeroMaior();
        somaNumeros.encontrarNumeroMenor();
        somaNumeros.exibirNumeros();
    }
}
