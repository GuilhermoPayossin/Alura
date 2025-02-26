package br.com.alura.exercicio4.conversor;

public class MainConversor {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println("Valor em dólar: " + conversor.converterDolarParaReal(120));
    }
}
