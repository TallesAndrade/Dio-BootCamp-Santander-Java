package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public  class Mentoria extends Conteudo {


    private LocalDate data;



    public LocalDate getData(LocalDate now) {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return xpPadrao+20d;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
