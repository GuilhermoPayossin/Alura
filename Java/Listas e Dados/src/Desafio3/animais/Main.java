package Desafio3.animais;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro cachorro) {
            System.out.println("É um cachorro: " + cachorro.getLatido());
        } else {
            System.out.println("Não faz parte da Classe cachorro");
        }
    }
}
