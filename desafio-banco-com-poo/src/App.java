import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente talles = new Cliente();
        talles.setNome("Talles");

        Conta cc = new ContaCorrente(talles);
        Conta poupanca = new ContaPoupanca(talles);

        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    double deposito = scanner.nextDouble();
                    cc.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double saque = scanner.nextDouble();
                    cc.sacar(saque);
                    break;
                case 3:
                    System.out.println("Digite o valor da transferência:");
                    double transferir = scanner.nextDouble();
                    System.out.println("Digite o tipo de conta para transferir (Corrente/Poupanca):");
                    String tipoConta = scanner.next();
                    if (tipoConta.equalsIgnoreCase("Corrente")) {
                        cc.transferir(transferir, cc);
                    } else if (tipoConta.equalsIgnoreCase("Poupanca")) {
                        cc.transferir(transferir, poupanca);
                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção de 1 a 4.");
                    break;
            }

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Depositar na Conta Corrente");
        System.out.println("2. Sacar da Conta Corrente");
        System.out.println("3. Transferir entre Contas (Corrente/Poupança)");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
