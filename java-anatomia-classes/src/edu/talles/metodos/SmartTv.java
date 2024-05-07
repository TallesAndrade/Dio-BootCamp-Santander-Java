package edu.talles.metodos;

public class SmartTv {
    boolean ligada= false;
    int volume = 15;
    int canal = 1;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){

        volume++;
        System.out.println("Aumentando o volume para "+ volume);
    }

    public void diminuirVolume(){

        volume--;
        System.out.println("Diminuindo o volume para " + volume);


    }

    public void subirCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}
