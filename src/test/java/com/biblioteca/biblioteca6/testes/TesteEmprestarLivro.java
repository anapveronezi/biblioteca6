package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEmprestarLivro {

    @Test
    void deveEmprestarLivro() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.emprestarLivro("1984");
        assertFalse(biblioteca.buscarLivroPorTitulo("1984").isDisponivel());
    }
}
