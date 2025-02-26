package Desafio1.pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 25);
        Pessoa p2 = new Pessoa("Maria", 20);
        Pessoa p3 = new Pessoa("João", 38);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas);


    }
}
