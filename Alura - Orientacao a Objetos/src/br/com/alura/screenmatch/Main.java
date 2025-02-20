package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDeAvaliacoes());

        System.out.println();

        Serie serie1 = new Serie();

        serie1.setNome("Invincible");
        serie1.setAnoDeLancamento(2021);
        serie1.exibirFichaTecnica();
        serie1.setTemporadas(3);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração completa da série: " + serie1.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Super Mario Bros. O Filme");
        outroFilme.setAnoDeLancamento(2023);
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

    }
}
