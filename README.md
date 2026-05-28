# Livraria - Projeto de POO (CC0019)

Este repositorio contem o desenvolvimento de um sistema de livraria em Java,
criado ao longo da disciplina de Programacao Orientada a Objetos (CC0019).

## Objetivo

O objetivo do projeto e praticar conceitos de orientacao a objetos em um
contexto proximo de um sistema real. A cada aula, novos cenarios sao
adicionados para que a livraria evolua de forma incremental.

## Desenvolvimento incremental

Este e um projeto em construcao. A estrutura e mantida organizada desde o
inicio para que o repositorio continue claro, facil de navegar e adequado para
portfolio publico.

## Estado atual

### Aula 01

Primeira modelagem da livraria com criacao de objetos, atributos, metodos e
associacao entre classes (`Livro` e `Autor`), alem de exemplos com comparacao de
referencias.

### Aula 02 - Encapsulamento e regras de negocio

Nesta etapa o projeto evoluiu para aplicar regras de negocio diretamente nas
classes de dominio:

- Todos os atributos de `Livro` e `Autor` foram encapsulados com `private`.
- O acesso aos dados passou a ser feito por getters e setters.
- `Livro.aplicaDescontoDe(double porcentagem)` agora retorna `boolean`:
  aplica desconto ate 30% e bloqueia valores acima disso.
- Foi criada a classe `RegrasDeDesconto` para validar os cenarios de desconto.
- Todo `Livro` agora precisa de um `Autor` no momento da criacao
  (dependencia obrigatoria no construtor).
- `Livro` possui sobrecarga de construtor:
  `Livro(Autor autor)` e
  `Livro(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn)`.
- No construtor `Livro(Autor autor)`, o ISBN recebe valor inicial
  `"000-00-0000-00-0"`.
- `Autor` tambem possui construtor completo:
  `Autor(String nome, String cpf, String email)`.
- Com a obrigatoriedade de autor no construtor, o metodo `temAutor()` foi
  removido por redundancia.

### Aula 03 - Heranca, sobrescrita e polimorfismo

Nesta etapa a livraria passou a diferenciar tipos de livro sem duplicar toda a
estrutura da classe principal:

- `Ebook` e `LivroFisico` foram criados como subclasses de `Livro`.
- `Ebook` adiciona informacoes proprias, como formato e tamanho do arquivo.
- `LivroFisico` adiciona o tipo de capa e calcula custo de envio com base no
  numero de paginas.
- `Ebook` sobrescreve `aplicaDescontoDe(double porcentagem)` para ter uma regra
  propria: desconto maximo de 15%.
- `CarrinhoDeCompras` recebe objetos do tipo `Livro`, permitindo adicionar tanto
  livros fisicos quanto ebooks por meio de polimorfismo.
- `RegistroDeVendas` demonstra o uso do carrinho com diferentes subclasses.
- `TestaCustoEnvio` demonstra uma regra especifica de `LivroFisico`.

O principal aprendizado foi separar o que e comum a todos os livros daquilo que
pertence apenas a um tipo especifico. Essa e a ideia central de heranca bem
usada: reaproveitar comportamento comum sem perder a responsabilidade propria de
cada classe.

## Classes implementadas

- `Livro`: entidade principal da livraria, com regras de desconto e
  associacao obrigatoria com `Autor`.
- `LivroFisico`: especializacao de `Livro` para livros impressos, com tipo de
  capa e calculo de custo de envio.
- `Ebook`: especializacao de `Livro` para livros digitais, com formato, tamanho
  de arquivo e regra propria de desconto.
- `Autor`: representa os dados de autoria dos livros.
- `CarrinhoDeCompras`: acumula o valor de livros adicionados ao carrinho,
  exercitando polimorfismo com a classe `Livro`.
- `CadastroDeLivros`: exemplo de cadastro e exibicao de livros/autores.
- `AplicarDescontoLivro`: exemplo simples de aplicacao de desconto.
- `RegrasDeDesconto`: validacao da regra de negocio de desconto maximo de 30%.
- `RegistroDeVendas`: exemplo de venda com livro fisico e ebook no mesmo
  carrinho.
- `TestaCustoEnvio`: exemplo de calculo de envio para livro fisico.
- `ComparandoReferencias`: demonstracao de comparacao de referencias e
  compartilhamento de objeto associado.

## Como executar

Compile as classes Java:

```powershell
javac -d out src/main/java/br/edu/ufca/poo/livraria/*.java
```

Execute as classes de exemplo:

```powershell
java -cp out br.edu.ufca.poo.livraria.CadastroDeLivros
java -cp out br.edu.ufca.poo.livraria.AplicarDescontoLivro
java -cp out br.edu.ufca.poo.livraria.RegrasDeDesconto
java -cp out br.edu.ufca.poo.livraria.ComparandoReferencias
java -cp out br.edu.ufca.poo.livraria.RegistroDeVendas
java -cp out br.edu.ufca.poo.livraria.TestaCustoEnvio
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
        CarrinhoDeCompras.java
        ComparandoReferencias.java
        Ebook.java
        Livro.java
        LivroFisico.java
        RegrasDeDesconto.java
        RegistroDeVendas.java
        TestaCustoEnvio.java
  test/
    java/
      br/edu/ufca/poo/livraria/
```

- `src/main/java`: codigo principal da aplicacao.
- `src/test/java`: espaco reservado para testes futuros.
