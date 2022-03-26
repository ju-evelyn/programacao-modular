import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nova conta");
        System.out.println("Digite o saldo inicial a ser depositado na nova conta: ");
        Conta novaConta = new Conta(entrada.nextInt());
        System.out.println("Conta criada!");
        System.out.println("Detalhes: "+novaConta.imprimirDados());
        int operacao = 1;
        while (operacao>0&&operacao<4) {
            System.out.println("[1]Saque [2]Depósito [3]Conferir Dados [4]Encerrar");
            operacao = entrada.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    novaConta.sacar(entrada.nextInt());
                    System.out.println("Saque realizado!");
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    novaConta.depositar(entrada.nextInt());
                    System.out.println("Depósito realizado!");
                    break;
                case 3:
                    System.out.println("Detalhes: "+novaConta.imprimirDados());
                    break;
            }
        }
        entrada.close();
    }
}
