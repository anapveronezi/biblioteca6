package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteDevolverLivroIndisponivel {

    @Test
    void deveLancarErroAoDevolverLivroJaDisponivel() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));

        assertThrows(IllegalStateException.class,
                () -> biblioteca.devolverLivro("1984")
        );
    }
}

