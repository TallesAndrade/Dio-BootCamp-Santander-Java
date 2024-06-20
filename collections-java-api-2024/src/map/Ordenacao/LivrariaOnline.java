package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private final Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livroMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesParaRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesParaRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesParaRemover) {
            livroMap.remove(chave);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(livroMap.entrySet());
        livrosPorPreco.sort(new Livro.ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Livro> entry : livrosOrdenadosPorPreco.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosAutor = new ArrayList<>(livroMap.entrySet());
        livrosAutor.sort(new Livro.LivrosAutor());
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosAutor) {
            livrosPorAutor.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Livro> entry : livrosPorAutor.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void obterLivroMaisCaro() {
        if (livroMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Livro livro : livroMap.values()) {
            if (livro.getPreco() > maiorPreco) {
                maiorPreco = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        if (livroMaisCaro != null) {
            System.out.println("O livro mais caro " + livroMaisCaro + " por " + maiorPreco);
        } else {
            System.out.println("Nenhum livro encontrado");
        }
    }

    public void exibirLivroMaisBarato() {
        if (livroMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Livro livro : livroMap.values()) {
            if (livro.getPreco() < menorPreco) {
                menorPreco = livro.getPreco();
                livroMaisBarato = livro;
            }
        }
        if (livroMaisBarato != null) {
            System.out.println("O livro mais barato é " + livroMaisBarato + " por " + menorPreco);
        } else {
            System.out.println("Nenhum livro encontrado");
        }
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z1", new Livro("Animal Farm", "George Orwell", 35d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z2", new Livro("O Hobbit", "J.R.R. Tolkien", 40d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z3", new Livro("The Lord of the Rings", "J.R.R. Tolkien", 60d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z4", new Livro("To Kill a Mockingbird", "Harper Lee", 55d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z5", new Livro("The Great Gatsby", "F. Scott Fitzgerald", 30d));
        livraria.adicionarLivro("https://amzn.to/3EclT8Z6", new Livro("Moby Dick", "Herman Melville", 20d));

        livraria.removerLivro("The Catcher in the Rye");

        System.out.println("Livros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nLivros ordenados por autor:");
        livraria.exibirLivrosOrdenadosPorAutor();

        System.out.println("\nLivro mais caro:");
        livraria.obterLivroMaisCaro();

        System.out.println("\nLivro mais barato:");
        livraria.exibirLivroMaisBarato();
    }
}
