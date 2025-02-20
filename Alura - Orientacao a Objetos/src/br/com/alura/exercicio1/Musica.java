package br.com.alura.exercicio1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica () {
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("--- Fim da Ficha---");
    }

    void avaliarMusica (double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaDeAvaliacoes () {
        return avaliacao / numAvaliacoes;
    }
}
