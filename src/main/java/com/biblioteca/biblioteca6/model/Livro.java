package com.biblioteca.biblioteca6.model;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (!disponivel) {
            throw new IllegalStateException("Este livro já está emprestado e não pode ser emprestado novamente.");
        }
        this.disponivel = false;
    }

    public void devolver()
    {

        if (disponivel) {
            throw new IllegalStateException("O livro já está disponível e não pode ser devolvido novamente.");
        }
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
