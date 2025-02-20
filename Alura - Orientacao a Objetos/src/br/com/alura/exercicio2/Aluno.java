package br.com.alura.exercicio2;

public class Aluno {

    private String nome;
    private double notas;
    private int numNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void somarNotas(double notas) {
        this.notas += notas;
        numNotas++;
    }

    public double calcularMedia() {
        return notas / numNotas;
    }
}
