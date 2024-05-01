
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Talles";
        System.out.println(primeiroNome);
        String segundoNome = "Andrade";
        System.out.println(segundoNome);
        int anoFabricacao = 2022;
        System.out.println(anoFabricacao);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        String nomeCompleto=nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

        System.out.print("Hello World!");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
