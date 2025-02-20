package br.com.alura.exercicio4.calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("Área: " + calculadora.calcularArea(5,6.5));
        System.out.println("Perimetro: " + calculadora.calcularPerimetro(7,5.5));
    }

}
