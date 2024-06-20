package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String,Integer> palavrasSet;

    public ContagemPalavra() {
        this.palavrasSet = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasSet.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            palavrasSet.remove(palavra);
        }else {
            System.out.println("Map vazio!");
        }
    }
    public void exibirContagemPalavras(){
        if (!palavrasSet.isEmpty()){
        for (Map.Entry<String,Integer> entry : palavrasSet.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        }else{
            System.out.println("Lista Vazia");
        }

    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasSet.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }
    public static void main(String[] args) {
        ContagemPalavra contador = new ContagemPalavra();

        contador.adicionarPalavra("java", 5);
        contador.adicionarPalavra("python", 3);
        contador.adicionarPalavra("javascript", 7);

        System.out.println("Palavras e suas contagens:");
        contador.exibirContagemPalavras();

        contador.removerPalavra("python");

        System.out.println("\nApós remover 'python':");
        contador.exibirContagemPalavras();

        String maisFrequente = contador.encontrarPalavrasMaisFrequente();
        System.out.println("\nPalavra mais frequente: " + maisFrequente);
    }
}

