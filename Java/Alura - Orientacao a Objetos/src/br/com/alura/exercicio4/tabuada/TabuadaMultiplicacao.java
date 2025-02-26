package br.com.alura.exercicio4.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void tabuada(int numero) {
        System.out.println("Tabuada do número " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
