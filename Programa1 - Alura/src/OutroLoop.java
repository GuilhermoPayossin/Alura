import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Digite sua avaliação do filme ou -1 para encerrar: ");
            nota = sc.nextDouble();
            if (nota != -1) {
            mediaAvaliacao += nota;
            totalDeNotas++;
            }
        }

        if (totalDeNotas == 0) {
            System.out.println("Nenhuma nota foi inserida!");
        } else {
            System.out.println("Media de avaliação do filme: " + mediaAvaliacao / totalDeNotas);
        }
    }
}
