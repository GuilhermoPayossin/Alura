package br.com.alura.exercicio4.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
    double valorDolar = 5.91;

    @Override
    public double converterDolarParaReal(double valor) {
        return valor / valorDolar;
        //Isso aqui é uma tristeza
    }
}
