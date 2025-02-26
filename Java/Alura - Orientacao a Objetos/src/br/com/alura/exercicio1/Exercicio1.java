package br.com.alura.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        Calculadora calcular = new Calculadora();
        Musica musica1 = new Musica();
        Carro carro1 = new Carro();
        Aluno aluno1 = new Aluno();

        System.out.println("\n*********************\n");
        novaPessoa.imprimir();
        System.out.println("\n*********************\n");

        System.out.println("Número dobrado: " + calcular.dobrarNumero(8));
        System.out.println("\n*********************\n");

        musica1.titulo = "Borderline";
        musica1.artista = "Tame Impala";
        musica1.anoLancamento = 2020;

        musica1.exibirFichaTecnica();
        musica1.avaliarMusica(7.3);
        musica1.avaliarMusica(9.6);
        musica1.avaliarMusica(8.5);
        System.out.println("\nNúmero de avaliaçoes: " + musica1.numAvaliacoes);
        System.out.println("Média de avaliaçoes: " + String.format("%.2f",musica1.mediaDeAvaliacoes()));

        System.out.println("\n*********************\n");

        carro1.modelo = "Volkswagen Gol";
        carro1.ano = 1980;
        carro1.cor = "Vermelho";


        carro1.exibirFichaTecnica();
        System.out.println("\nO carro tem " + carro1.idadeCarro(2025) + " anos");
        System.out.println("\n*********************\n");

        aluno1.nome = "Guilhermo";
        aluno1.idade = 18;

        aluno1.exibirInformacoes();
        System.out.println("\n*********************\n");
        System.out.println("Fim da execução");
    }
}
