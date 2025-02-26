import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = sc.nextLine();
        System.out.print("Qual o ano de lançamento: ");
        int anoDeLancamento = sc.nextInt();
        System.out.print("Digite sua avaliação do filme");
        double avaliacao = sc.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        sc.close();
    }
}
