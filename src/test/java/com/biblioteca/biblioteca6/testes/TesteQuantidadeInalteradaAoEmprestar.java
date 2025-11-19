package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteQuantidadeInalteradaAoEmprestar {

    @Test
    void naoDeveAlterarQuantidadeAoEmprestar() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        int total = biblioteca.listarLivros().size();
        biblioteca.emprestarLivro("1984");
        assertEquals(total, biblioteca.listarLivros().size());
    }
}