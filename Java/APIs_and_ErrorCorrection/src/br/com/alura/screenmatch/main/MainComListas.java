package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avaliar(8);
        Filme outroFilme = new Filme("Super Mario Bros. O Filme", 2023);
        outroFilme.avaliar(9);
        Filme maisUmFilme = new Filme("Homem-Aranha: No Aranhaverso", 2018);
        maisUmFilme.avaliar(10);
        Serie serie1 = new Serie("Invincible", 2021);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisUmFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(serie1);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Chris Pratt");
        buscaPorArtista.add("Theo James");
        buscaPorArtista.add("Megan Fox");
        buscaPorArtista.add("Scarlett Johansson");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Após ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
