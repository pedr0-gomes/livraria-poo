# Livraria - Projeto de POO (CC0019)

Este repositório contém o desenvolvimento de um sistema de livraria em Java,
criado ao longo da disciplina de Programação Orientada a Objetos (CC0019).

## Objetivo

O objetivo do projeto é praticar os conceitos de orientação a objetos em um
contexto próximo de um sistema real. A cada aula, novos cenários serão
adicionados ao sistema, permitindo que a livraria evolua de forma incremental
até se tornar um projeto mais completo.

## Desenvolvimento incremental

Este é um projeto em construção. A estrutura será mantida organizada desde o
início para que o repositório continue claro, fácil de navegar e adequado para
portfólio público conforme novas funcionalidades forem implementadas.

## Estado atual

### Aula 01

A primeira versão do projeto modela os conceitos iniciais de uma livraria:
livros, autores, associação entre objetos, construtores, métodos e comparação de
referências.

Classes implementadas:

- `Livro`: representa um livro da livraria. Possui nome, descrição, valor,
  número de páginas, ISBN e um autor associado. Também possui os comportamentos
  `mostrarDetalhes()`, `temAutor()` e `aplicaDescontoDe()`.
- `Autor`: representa o autor de um livro. Possui nome, e-mail e CPF, além do
  comportamento `mostrarDetalhes()`.
- `CadastroDeLivros`: classe executável usada para criar um autor, criar um
  livro associado a esse autor e exibir seus detalhes.
- `ComparandoReferencias`: classe executável usada para demonstrar a diferença
  entre dois objetos distintos com os mesmos dados e uma referência acessada por
  meio de outro objeto.
- `AplicarDescontoLivro`: classe executável usada para testar a aplicação de
  desconto em um livro.

O código desta etapa foi mantido fiel ao material da Aula 01. Por isso, os
atributos ainda são acessados diretamente pelas classes de exemplo, acompanhando
o momento inicial da disciplina.

## Como executar

Compile as classes Java:

```powershell
javac -d out src/main/java/br/edu/ufca/poo/livraria/*.java
```

Execute uma das classes de exemplo:

```powershell
java -cp out br.edu.ufca.poo.livraria.CadastroDeLivros
java -cp out br.edu.ufca.poo.livraria.ComparandoReferencias
java -cp out br.edu.ufca.poo.livraria.AplicarDescontoLivro
```

## Estrutura do projeto

```text
src/
  main/
    java/
      br/edu/ufca/poo/livraria/
        AplicarDescontoLivro.java
        Autor.java
        CadastroDeLivros.java
        ComparandoReferencias.java
        Livro.java
  test/
    java/
      br/edu/ufca/poo/livraria/
```

- `src/main/java`: código principal da aplicação.
- `src/test/java`: espaço reservado para testes futuros.
