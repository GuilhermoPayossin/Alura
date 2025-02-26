package br.com.alura.exercicio2;

public class Livro {

    private String titulo;
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirLivro() {
        System.out.println("------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("------------------");
    }
}
