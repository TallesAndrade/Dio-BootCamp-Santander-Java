
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor informe os dados Solicitados!");

        System.out.println("Nome Completo");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Conta:");
        String conta = scanner.next();

        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá "+nomeCompleto+", obrigado por criar a sua conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de R$ "+saldo+" já está disponivel para saque.");

    }
}
