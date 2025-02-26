package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui (Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
