package br.com.alura.exercicio3.animais;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}
