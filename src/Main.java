import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite o número da conta: ");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Digite o número da agência (com dígito - ): ");
        contaTerminal.agencia = scanner.next();

        System.out.println("Digite o nome completo do cliente: ");
        scanner.nextLine();
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo do cliente: ");
        contaTerminal.saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo de R$" + contaTerminal.saldo + " já está disponível" );
    }
}