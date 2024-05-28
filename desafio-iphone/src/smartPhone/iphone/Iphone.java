package smartPhone.iphone;


import smartPhone.sistemaOperacional.funcionalidades.IOS;

public class Iphone {
    public static void main(String[] args) {
        IOS iphone = new IOS();
        iphone.tocar();
        iphone.selecionarMusica("Money - Jovem Dex");
        iphone.pausar();

        iphone.ligar("30033030");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    }

