package smartPhone.sistemaOperacional.funcionalidades;

import smartPhone.sistemaOperacional.funcionalidades.musical.ReprodutorMusical;
import smartPhone.sistemaOperacional.funcionalidades.navegador.NavegadorInternet;
import smartPhone.sistemaOperacional.funcionalidades.telefonia.AparelhoTelefonico;

public class IOS implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Pausando Musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Escolhendo musica " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
