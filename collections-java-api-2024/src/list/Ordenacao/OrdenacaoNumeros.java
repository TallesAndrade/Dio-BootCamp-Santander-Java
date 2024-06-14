package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int... numeros) {
        for (int numero : numeros) {
            listaNumeros.add(numero);
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaNumeros);
    }

    public void ordenarDescendente() {
        listaNumeros.sort(Collections.reverseOrder());
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10, 20, 40, 25, 8, 9, 10, 2, 7, 15);

        System.out.println("Lista original:");
        ordenacaoNumeros.exibirNumeros();

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Lista em ordem ascendente:");
        ordenacaoNumeros.exibirNumeros();

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Lista em ordem descendente:");
        ordenacaoNumeros.exibirNumeros();
    }
}
