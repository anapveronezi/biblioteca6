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
-   **Testes** -- contém os 8 testes unitários.

------------------------------------------------------------------------

## Casos de Teste Automatizados

Os testes cobrem:

1.  Adicionar livros;
2.  Buscar livro pelo título;
3.  Lançar erro ao buscar livro inexistente
4.  Emprestar livro disponível;
5.  Erro ao emprestar livro já emprestado;
6.  Devolver livro;
7.  Verificar disponibilidade inicial;
8.  Garantir que a quantidade total não muda;

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
