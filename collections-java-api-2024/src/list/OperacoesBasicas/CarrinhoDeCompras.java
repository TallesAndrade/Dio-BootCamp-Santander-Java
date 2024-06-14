package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {



    private final List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras" +
                "itens=" + itemList
                ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("Quantos lapis:");
        int lapis = scanner.nextInt();
        System.out.println("Quantos cadernos:");
        int caderno = scanner.nextInt();
        System.out.println("Quantos borrachas:");
        int borracha = scanner.nextInt();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, lapis);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, caderno);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, borracha);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        scanner.close();
    }

}

