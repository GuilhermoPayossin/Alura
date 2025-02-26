package br.com.alura.exercicio2;

public class idadePessoa {

    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void checarIdade() {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade");
            return;
        }
        System.out.println(nome + " é maior de idade");
    }
}
