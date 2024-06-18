package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private final Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("casa");
        conjunto.adicionarPalavra("carro");
        conjunto.adicionarPalavra("bicicleta");

        System.out.println("Palavras únicas após adicionar:");
        conjunto.exibirPalavras();

        conjunto.removerPalavra("carro");

        System.out.println("Palavras únicas após remover:");
        conjunto.exibirPalavras();

        System.out.println("Verificar se 'casa' está presente: " + conjunto.verificarPalavra("casa"));
        System.out.println("Verificar se 'carro' está presente: " + conjunto.verificarPalavra("carro"));
    }
}
