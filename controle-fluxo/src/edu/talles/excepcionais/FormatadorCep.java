package edu.talles.excepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2365064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoExeption{
        if(cep.length() != 8)
            throw new CepInvalidoExeption();

        //simulando um cep formatado
        return "23.765-064";
    }
}
