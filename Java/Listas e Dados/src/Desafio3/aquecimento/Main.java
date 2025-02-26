package Desafio3.aquecimento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Luis");
        nomes.add("Maria");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
