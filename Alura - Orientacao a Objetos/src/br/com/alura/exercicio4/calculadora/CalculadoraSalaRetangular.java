package br.com.alura.exercicio4.calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(double largura, double altura) {
        return largura * 2 + altura * 2;
    }
}
