package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteBuscarInexistente {

    @Test
    void deveLancarErroAoBuscarLivroInexistente() {
        BibliotecaService biblioteca = new BibliotecaService();
        assertThrows(IllegalArgumentException.class,
                () -> biblioteca.buscarLivroPorTitulo("Inexistente")
        );
    }
}