package Desafio2.produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 15.99, 15);
        Produto produto2 = new Produto("Refri", 5.99, 50);
        Produto produto3 = new Produto("Linguça", 12.99, 10);


        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println("Ultimo produto: " + produtos.get(2).toString());
        System.out.println(produtos);

    }
}
