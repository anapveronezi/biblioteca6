package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteDevolverLivro {

    @Test
    void deveDevolverLivro() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.emprestarLivro("1984");
        biblioteca.devolverLivro("1984");
        assertTrue(biblioteca.buscarLivroPorTitulo("1984").isDisponivel());
    }
}