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

### Aula 04 - MiniLivro e contrato de desconto

Nesta aula introduzimos o `MiniLivro`, uma edicao reduzida pensada para ser
mais acessivel. Para garantir que cada tipo de livro defina explicitamente sua
politica de desconto, `Livro` foi transformada em `abstract` e passou a declarar
o contrato:

`public abstract boolean aplicaDescontoDe(double porcentagem);`

Principais efeitos e implementacoes:

- `LivroFisico` implementa `aplicaDescontoDe` permitindo descontos de ate 30%.
- `Ebook` implementa `aplicaDescontoDe` permitindo descontos de ate 15%.
- `MiniLivro` implementa `aplicaDescontoDe` retornando sempre `false` (nenhum
  desconto permitido).
- Classes de teste/exemplo foram atualizadas: `CadastroDeLivros`,
  `AplicarDescontoLivro` e `ComparandoReferencias` que antes instanciavam
  `Livro` agora usam subclasses concretas. `RegrasDeDesconto` foi ajustada para
  criar e demonstrar o comportamento do `MiniLivro`.

Racional: transformar o metodo em abstrato forca que cada nova subclasse defina
claramente sua politica de desconto, preservando o polimorfismo e evitando
omissoes acidentais.

### Aula 05 - Interfaces e desacoplamento

Nesta etapa o projeto ganhou uma modelagem mais flexivel com interfaces para
separar o que e um produto da livraria do que pode receber desconto:

- Foi criada a interface `Produto`, com `getValor()` e `getResumo()`.
- `Livro` passou a implementar `Produto` e concentrou o resumo comum dos
  livros.
- `LivroFisico`, `Ebook`, `MiniLivro` e `Revista` passaram a expor seus
  resumos especificos.
- `CarrinhoDeCompras` passou a receber `Produto`, deixando de depender
  diretamente de `Livro`.
- Foi criada a classe `Editora` para representar os dados editoriais da
  revista.
- Foi criada a interface `Promocional`, com `aplicaDescontoDe(double)` e o
  default method `aplicaDescontoDe10Porcento()`.
- Apenas as classes que realmente aceitam desconto implementam
  `Promocional`.
- O desconto deixou de ser aplicado automaticamente no carrinho.

Racional: a separacao entre `Produto` e `Promocional` reduz acoplamento e evita
que metodos aparecam em classes onde eles nao fazem sentido, como acontecia com
o `MiniLivro`.

### Aula 06 - Array e Collections

Nesta aula o carrinho de compras ganhou comportamento mais realista, usando
estruturas da biblioteca padrao do Java para controlar multiplicidade de itens e
operacoes sobre o carrinho:

- O carrinho deixou de depender de um array fixo e passou a usar
  `Map<Produto, Integer>` para guardar cada produto e sua quantidade.
- O metodo `adiciona()` passou a somar quantidades usando `getOrDefault()`.
- Foi criado `getProdutos()` para expor o mapa de produtos quando necessario.
- O metodo `aplicarPercentualDesconto()` passou a aplicar desconto apenas em
  produtos que implementam `Promocional`.
- O metodo `getTotal()` passou a calcular o valor final com base no mapa,
  multiplicando valor unitario pela quantidade.
- Foi criado `imprimirCarrinho()` para exibir o resumo dos itens e o total da
  compra.
- Foi criado `remove()` para remover uma unidade por vez do carrinho, mantendo
  a contagem correta quando o item ainda possui mais de uma unidade.
- `RegistroDeVendas` agora monta `LivroFisico`, `Ebook` e `Revista`, simula
  multiplas unidades, imprime o carrinho antes e depois do desconto e tambem
  exercita a remocao de itens.

Aprendizados principais:

- `ArrayList` e `HashMap` sao mais adequados do que arrays fixos quando a
  quantidade de elementos varia.
- `Map` e uma boa escolha para representar item + quantidade.
- Interfaces como `Produto` e `Promocional` ajudam o carrinho a trabalhar com
  tipos diferentes sem acoplamento desnecessario.
- Em um carrinho, o total deve ser calculado a partir do estado atual dos itens,
  nao mantido manualmente em paralelo.

## Classes implementadas

- `Livro`: entidade principal da livraria, com regras de desconto e
  associacao obrigatoria com `Autor`.
- `LivroFisico`: especializacao de `Livro` para livros impressos, com tipo de
  capa e calculo de custo de envio.
- `Ebook`: especializacao de `Livro` para livros digitais, com formato, tamanho
  de arquivo e regra propria de desconto.
- `MiniLivro`: especializacao de `Livro` para edicao reduzida sem desconto.
- `Revista`: produto editorial com `Editora` associada.
- `Editora`: representa os dados editoriais de uma revista.
- `Autor`: representa os dados de autoria dos livros.
- `Produto`: interface que representa qualquer item vendavel da livraria.
- `Promocional`: interface que representa os produtos que aceitam desconto.
- `CarrinhoDeCompras`: controla produtos e quantidades com `Map`, aplica
  desconto seletivo, imprime o carrinho e remove unidades individualmente.
- `CadastroDeLivros`: exemplo de cadastro e exibicao de livros/autores.
- `AplicarDescontoLivro`: exemplo simples de aplicacao do default method de
  desconto.
- `RegrasDeDesconto`: validacao das regras de desconto de livros e ebooks.
- `RegistroDeVendas`: exemplo de venda com livro fisico, ebook e revista no
  mesmo carrinho, com desconto e remocao de item.
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
        Editora.java
        Livro.java
        LivroFisico.java
        MiniLivro.java
        Produto.java
        Promocional.java
        RegrasDeDesconto.java
        RegistroDeVendas.java
        Revista.java
        TestaCustoEnvio.java
  test/
    java/
      br/edu/ufca/poo/livraria/
```

- `src/main/java`: codigo principal da aplicacao.
- `src/test/java`: espaco reservado para testes futuros.
