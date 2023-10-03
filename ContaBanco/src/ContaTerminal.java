import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // informações da conta
        String agencia = "067-8";
        int numero = 1021;
        String nomeCliente = "MARIO ANDRADE";
        double  saldo = 237.48;

        // Captura as informações de numero da agencia e numero da conta digitadas pelo cliente.
        System.out.print("Digite o numero da agencia: ");
        String entradaAgencia = leitor.nextLine();
        System.out.print("Digite o numero da conta: ");
        int entradaNumero = leitor.nextInt();

        // Encerrando o scanner pois o mesmo não será mais usado.
        leitor.close();

        // Valida se os dados estão corretos para apresentar a mensagem mais apropriada.
        if(entradaAgencia.equals(agencia) && entradaNumero == numero){
            System.out.print("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");
        }
        else
            System.out.println("Dados incorretos.");
    }
}
