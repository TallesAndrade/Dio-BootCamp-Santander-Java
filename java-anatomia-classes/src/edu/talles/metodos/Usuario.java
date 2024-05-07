package edu.talles.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume está em "+ smartTv.volume);
        System.out.println("Qual o canal? "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual o canal? "+smartTv.canal);

        System.out.println("SmartTv está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume? " + smartTv.volume);
        System.out.println("Qual o canal? "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("O canal foi para "+ smartTv.canal);

        smartTv.subirCanal();
        System.out.println("O canal foi para "+ smartTv.canal);


        smartTv.ligar();
        System.out.println("SmartTv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("SmartTv está ligada? " + smartTv.ligada);
    }
}
