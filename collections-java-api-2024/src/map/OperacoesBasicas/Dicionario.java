package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else {
            System.out.println("Dicionário vazio!");
        }
    }
    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            for (Map.Entry<String,String> entry:dicionarioMap.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }else {
            System.out.println("Dicionario esta vazio");
        }
    }
    public void pesquisarPorPalavra(String palavra){
        if (dicionarioMap.containsKey(palavra)){
            String definicao = dicionarioMap.get(palavra);
            System.out.println(palavra+ ":"+definicao );
        }else {
            System.out.println("Palavra não encontrada!");
        }
    }

        public static void main(String[] args) {
            Dicionario dicionario = new Dicionario();

            dicionario.adicionarPalavra("Casa", "Construção destinada a ser habitada.");
            dicionario.adicionarPalavra("Carro", "Veículo automotor com quatro rodas.");
            dicionario.adicionarPalavra("Computador", "Máquina eletrônica capaz de armazenar e processar dados.");

            System.out.println("Todas as palavras:");
            dicionario.exibirPalavras();
            System.out.println();

            System.out.println("Pesquisar por 'Carro':");
            dicionario.pesquisarPorPalavra("Carro");
            System.out.println();

            System.out.println("Pesquisar por 'Avião':");
            dicionario.pesquisarPorPalavra("Avião");
            System.out.println();

            System.out.println("Remover a palavra 'Casa':");
            dicionario.removerPalavra("Casa");
            System.out.println();

            System.out.println("Todas as palavras após remoção:");
            dicionario.exibirPalavras();
        }
    }

