package br.com.alura.exercicio1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica () {
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("--- Fim da Ficha---");
    }

    int idadeCarro (int anoParaCalculo) {
        return anoParaCalculo - ano;
    }
}
