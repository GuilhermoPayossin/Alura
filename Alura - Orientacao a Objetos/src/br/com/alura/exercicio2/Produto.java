package br.com.alura.exercicio2;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(int porcentagem) {
        System.out.println(String.format("%.2f", preco - (preco * porcentagem / 100)));
    }
}
