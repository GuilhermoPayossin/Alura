import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha != -1) {
                System.out.println("""
                        Escolha uma opção:
                        0: Detector de número positivo/negativo
                        1: Comparador de valores
                        2: Calcular área de uma forma
                        3: Gerador de tabuada
                        4: Detector de número par/ímpar
                        5: Calculador de fatorial
                        -1: Sair
                        """);
                escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();

                    if (numero > 0) {
                        System.out.println("Número positivo");
                    } else {
                        System.out.println("Número negativo");
                    }
                    break;
                case 1:
                    int n1, n2;

                    System.out.print("Insira o primeiro número: ");
                    n1 = sc.nextInt();
                    System.out.print("Insira o segundo número: ");
                    n2 = sc.nextInt();

                    if (n1 == n2) {
                        System.out.println("Números iguais");
                    } else {
                        System.out.print("Números diferentes, ");
                        if (n1 > n2) {
                            System.out.println(n1 +" é maior que " + n2);
                        } else {
                            System.out.println(n2 + " é maior que " + n1);
                        }
                    }
                    break;
                case 2:
                    int forma;

                    System.out.println("Quer calcular a área de um quadrado ou de um circulo?\n1 - Quadrado\n2 - Circulo");
                    forma = sc.nextInt();

                    while (true) {
                        double valorForma;

                        if (forma == 1) {
                            System.out.print("Insira o tamanho do lado do seu quadrado: ");
                            valorForma = sc.nextDouble();

                            valorForma *= 2;
                            System.out.println("A área do seu quadrado é de " + String.format("%.2f", valorForma));
                            break;
                        } else if (forma == 2) {
                            System.out.print("Insira o tamanho do raio do seu circulo: ");
                            valorForma = sc.nextDouble();

                            valorForma = 3.14 * (valorForma * valorForma);
                            System.out.println("A área do seu circulo é de " + String.format("%.2f", valorForma));
                            break;
                        } else {
                            System.out.println("Forma inválida, selecione novamente\n1 - Quadrado\n2 - Circulo");
                            forma = sc.nextInt();
                        }
                    }
                    break;
                case 3:
                    int numTabuada;

                    System.out.print("Digite o número que quer saber a tabuada: ");
                    numTabuada = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " - " + numTabuada * i);
                    }
                    break;
                case 4:
                    int numParImpar;

                    System.out.print("Digite um numero: ");
                    numParImpar = sc.nextInt();

                    if (numParImpar % 2 == 0) {
                        System.out.println("Número par");
                    } else {
                        System.out.println("Número impar");
                    }
                    break;
                case 5:
                    int fatorial = 1, numeroFatorial;

                    System.out.print("Digite o numero que deseja saber o fatorial: ");
                    numeroFatorial = sc.nextInt();

                    for (int i = 1; i <= numeroFatorial; i++) {
                        fatorial *= i;
                    }
                    System.out.println("O fatorial de " + numeroFatorial + " é " + fatorial);
                    break;
                case -1:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.err.println("Insira uma opção válida");
            }
        }
    }
}
