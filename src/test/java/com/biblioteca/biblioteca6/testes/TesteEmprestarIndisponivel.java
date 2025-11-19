package com.biblioteca.biblioteca6.testes;

import com.biblioteca.biblioteca6.model.BibliotecaService;
import com.biblioteca.biblioteca6.model.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEmprestarIndisponivel {

    @Test
    void deveLancarErroAoEmprestarLivroIndisponivel() {
        BibliotecaService biblioteca = new BibliotecaService();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.emprestarLivro("1984");
        assertThrows(IllegalStateException.class,
                () -> biblioteca.emprestarLivro("1984")
        );
    }
}
