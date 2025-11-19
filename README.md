# Biblioteca Java -- Projeto de Testes Unitários

## Descrição do Projeto

Este projeto implementa um sistema básico de gerenciamento de biblioteca
em **Java**, sem interface gráfica, focado apenas na lógica de negócio.
O sistema permite:

-   Adicionar livros à biblioteca;
-   Buscar livros pelo título;
-   Emprestar e devolver livros;

Regras de negócio:

-   Um livro só pode ser emprestado se estiver disponível;
-   Ao devolver um livro, ele volta a ficar disponível;
-   A quantidade total de livros não muda ao emprestar ou devolver.
-   Buscar um livro inexistente lança erro;
-   Não é permitido emprestar um livro já emprestado;

O projeto foi desenvolvido com foco na qualidade do código, garantindo que cada funcionalidade tenha cobertura de testes JUnit.

------------------------------------------------------------------------

## Linguagem e Framework de Testes

-   Linguagem: **Java 21**
-   Framework: **JUnit 5**

------------------------------------------------------------------------

## Estrutura do Projeto

    biblioteca/
    ├─ src/
    │  ├─ main/
    │  │  └─ java/com/biblioteca/model/
    │  │     ├─ Livro.java
    │  │     ├─ Usuario.java
    │  │     └─ BibliotecaService.java
    │  └─ test/
    |      └── java/com/biblioteca/biblioteca6/testes/
    │           ├── TesteAdicionarLivro.java
    │           ├── TesteBuscarLivro.java
    │           ├── TesteBuscarLivroInexistente.java
    │           ├── TesteEmprestarLivro.java
    │           ├── TesteEmprestarIndisponivel.java
    │           ├── TesteDevolverLivro.java
    │           ├── TesteEstadoInicial.java
    │           └── TesteQuantidadeInalteradaAoEmprestar.java
    ├─ .gitignore
    └─ README.md

### Arquivos principais:

-   **Livro.java** -- Representa cada livro com título, autor e disponibilidade
-   **Usuario.java** -- Representa um usuário (base para extensões
    futuras);
-   **BibliotecaService.java** -- contém a lógica de negócio;
-   **Testes** -- contém os 9 testes unitários.

------------------------------------------------------------------------

## Casos de Teste Automatizados

# Resumo dos Testes da Biblioteca

- **TesteAdicionarLivro** – Verifica se os livros são adicionados.  
- **TesteBuscarLivro** – Verifica busca por título existente.  
- **TesteBuscarLivroInexistente** – Verifica exceção ao buscar livro inexistente.  
- **TesteEmprestarLivro** – Verifica se um livro pode ser emprestado.  
- **TesteEmprestarIndisponivel** – Verifica exceção ao tentar emprestar livro já emprestado.  
- **TesteDevolverLivro** – Verifica se um livro pode ser devolvido.  
- **TesteDevolverLivroIndisponivel** – Verifica exceção ao tentar devolver livro já disponível.  
- **TesteEstadoInicial** – Verifica se livro novo começa disponível.  
- **TesteQuantidadeInalteradaAoEmprestar** – Verifica se a quantidade total de livros não muda ao emprestar.


Todos os testes usam JUnit 5 e assertions como assertEquals, assertTrue, assertThrows, etc.

------------------------------------------------------------------------

## Como Executar o Projeto e os Testes

``` bash
# Clonar o repositório
git clone https://github.com/gabriellesouzaps/biblioteca.git
cd biblioteca

# Compilar o projeto
mvn compile

# Rodar os testes
mvn test
```

------------------------------------------------------------------------

## Controle de Versionamento – GitFlow

- Este projeto segue o padrão GitFlow, utilizando as seguintes branches:

-   **master** -- versão estável\
-   **develop** -- desenvolvimento\
-   **feature/** -- novas funcionalidades\
-   **release/** -- preparação de versão\
-   **hotfix/** -- correções urgentes

### Padrões de commit

-   `feat: adicionar método de busca`
-   `test: criar teste para devolução`
-   `fix: corrigir erro no empréstimo`
