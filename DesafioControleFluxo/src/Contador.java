import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valorUm = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        int valorDois = scanner.nextInt();



        try {
            contar(valorUm,valorDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor deve ser maior que o primeiro.");

        }


    }
    static void contar(int valorUm, int valorDois) throws ParametrosInvalidosException{
        if (valorUm > valorDois) {
            throw new ParametrosInvalidosException();
        }else{
            int contador = valorDois - valorUm;

            for (int i = 1; i <= contador; i++){
                System.out.println("Imprimindo o número "+i);
            }
        }

    }
}
