//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Catálogo de Filmes
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoLancamento);
        boolean inclusoNoPlano = true;
        double notaFilme = 8.1;
        double media = (8.3 + 7.0 + 6.8) / 3;
        String sinopse = """
                         Filme de ação com galã dos anos 80
                         Lançado em: """ + " " + anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("classificacao de " + classificacao + " estrelas");
    }
}