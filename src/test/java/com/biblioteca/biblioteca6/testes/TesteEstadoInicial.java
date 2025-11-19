package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEstadoInicial {

    @Test
    void livroInicialmenteDisponivel() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        assertTrue(biblioteca.buscarLivroPorTitulo("Dom Casmurro").isDisponivel());
    }
}
