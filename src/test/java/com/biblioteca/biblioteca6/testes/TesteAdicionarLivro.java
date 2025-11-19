package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteAdicionarLivro {

    @Test
    void deveAdicionarLivro() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro("O Hobbit", "Tolkien"));
        assertEquals(3, biblioteca.listarLivros().size());
    }
}