    public class ContaTerminalArgs {
        public static void main(String[] args) {
            //System.out.println("Por Favor informe os dados Solicitados!");


            String nomeCompleto = args[0];


            int agencia = Integer.parseInt(args[1]);


            String conta = args[2] ;

            double saldo = Double.parseDouble(args[3]);


            System.out.println("Olá "+nomeCompleto+", obrigado por criar a sua conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de R$ "+saldo+" já está disponivel para saque.");

        }
    }
