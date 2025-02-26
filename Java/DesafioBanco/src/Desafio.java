import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Guilhermo";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n***********************");

        String menu = """
                *** Digite sua opção ***
                1: Cosultar saldo
                2: Sacar saldo
                3: Depositar saldo
                4: Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atualizado é "+ saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que sera sacado: ");
                    double valorSacado = sc.nextDouble();
                    if (valorSacado > saldo) {
                        System.err.println("Saldo insuficiente");
                    } else {
                        saldo -= valorSacado;
                        System.out.println("Saldo atualizado: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que sera depositado: ");
                    double valorDepositado = sc.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.err.println("Opção Invalida");
            }
        }

    }
}