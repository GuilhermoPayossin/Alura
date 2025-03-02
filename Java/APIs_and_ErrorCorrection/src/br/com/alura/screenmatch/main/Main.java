package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDeAvaliacoes());

        System.out.println();

        Serie serie1 = new Serie("Invincible", 2021);
        serie1.exibirFichaTecnica();
        serie1.setTemporadas(3);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração completa da série: " + serie1.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Super Mario Bros. O Filme", 2023);
        outroFilme.setDuracaoEmMinutos(90);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio1 = new Episodio();

        episodio1.setNumero(1);
        episodio1.setSerie(serie1);
        episodio1.setTotalVisualizacoes(300);
        filtro.filtra(episodio1);

        Filme maisUmFilme = new Filme("Homem-Aranha: No Aranhaverso", 2018);
        maisUmFilme.setDuracaoEmMinutos(120);
        maisUmFilme.avaliar(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(maisUmFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getNome());

        //Teste do toString()
        //Reescrita do metodo
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0));

    }
}
