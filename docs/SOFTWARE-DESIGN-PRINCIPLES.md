# SOFTWARE DESIGN PRINCIPLES [UML, DESIGN PATTERNS, SOLID]

Quando falamos do design de componentes, nosso sistema, estamos falando de arquitetura de software. Como organizamos o software? como as partes falam entre si? como armazenamos dados?

Design de software ajuda a não aumentar a complexidade e manter o código organizado quando novo código for adicionado, para que tudo possa conversar em harmonia.

## DRY [Don't Repeat Yourself]: 
O código deve ser o menos ambíguo possível. Ou seja, evitar repetir informações ou trechos de código. O sistema deve ser dividido em partes, em funções reutilizáveis, objetivas e compreensíveis.

## KISS [Keep It Simple, Silly]: 
Simplificar ao máximo possível, reduzindo o escopo das funções e evitando criar variáveis desnecessárias. Por isso é importante saber sobre funções nativas da linguagem, para evitar casos onde se faz algo enorme enquanto uma função nativa poderia resolver.

## YAGNI [You ain't gonna need it]: 
Usualmente escrevemos código para coisas que planejamos adicionar, sendo que isto atualmente não é necessário; por tanto, é importante apenas implementar algo somente se for usado. Apenas escreva o código do que você precisa no momento, assim você mantêm o número de peças no sistema reduzido.

---

# OOP and UML

Antes da programação orientada a objetos, a programação era imperativa. Isto adicionou abstração, encapsulamento, herança e polimorfismo.

## [POO] UML: Descrevendo um objeto e suas relações

Classe é um tipo: Cachorro
Objeto é instância de uma classe: Salsicha, Bulldog
Atributo é característica de um objeto: nome, peso, altura (dados)
Métodos são ações de um objeto: latir, pular, correr (comportamento)

[Classe
--------------- 
-Atributos:double     
---------------
+Método()
+Método(double)
+getMétodo():double
+método(double):void]

# Encapsulação
Um objeto deve gerencial seu estado interno, mostrando apenas comportamentos que serão usados por outros objetos. Comportamentos abstratos de um objeto devem ser acessados por outros objetos, e acessar atributos ou métodos internos do mesmo, deveria ser restrito.

Organiza código que deve estar junto porque faz parte do mesmo sistema, querendo dizer que uma classe ou um objeto sempre está encapsulado, dentro de um escopo, ou seja, pode ser privado para outros, ou não.

Class -> Task (Description and Methods) 
Objects -> Task1 (Description and Methods) and Task2 (Description and Methods) 

## Abstração
É representar uma ideia no seu mais alto nível. Quando criamos os métodos de um objeto, queremos abstrair o que os métodos farão no nível mais alto possível. Isto permite que outras classes dependam apenas do panorama geral de outra classe, o qual tem menos chance de mudar com o tempo.

Abstrair um método por exemplo é criar um método em outro lugar, ou seja, abstrair a lógica dele em outro lugar, e chama-lo dentro do código.

# Herança
Significa que um objeto herda características do objeto pai. Herança nos permite implementar comportamentos compartilhados por subclasses do objeto pai, e deixar a implementação de diferenças comportamentais para um objeto filho.

# Polimorfismo
Ao definir classes usando herança, podemos reusar aspectos de objetos que se mantêm iguais. Com polimorfismo, podemos definir as diferenças entre subclasses, permitindo à uma classe, subscrever o comportamento herdado da superclasse.

# SOLID PRINCIPLES
Os princípios SOLID têm o objetivo de criar software que é simples de mudar, entender e reusar. Quer dizer que em um caso ideal, temos muitas classes pequenas em um programa, cada uma sendo responsável por uma parte do código. Tudo tende à distribuição de tarefas.

## Single Responsibility Principle: 
"Um módulo (uma classe, ou uma série de funções) devem ter apenas uma razão para mudar", e a razão pode ser mudanças no banco de dados, decisões de negócio, ajustes na experiência de usuário, etc. Ou seja, se você for mudar algo, deve ser apenas uma coisa, querendo dizer que devem existir funções específicas para cada quesito. Isto minimiza o impacto de mudanças entre arquivos.

## Open-Closed Principle: 
"Adicionar funcionalidades durante a criação de novas classes ao invés de mudar as classes existentes, deve ser possível.". Quer dizer que classes devem estar abertas para extensões, mas fechadas para modificações, ou seja que a forma de adicionar novas funcionalidades ao nosso sistema deve ser por meio da adição de novas classes, sem ter que mudar as existentes, pois editar classes existentes pode quebrar o programa, já que muitas vezes uma classe tem muitas subclasses dependentes.

## Liskov Substitution Principle: 
Substituir uma superclasse com suas subclasses deve ser possível, sem quebrar a base de código. Isto quer dizer que se por exemplo, temos uma superclasse Pet, e subclasses Dog, Cat e Turtle, deveríamos poder substituir a Classe Pet com qualquer uma das subclasses e ainda deveria funcionar.

## Interface Segregation Principle:
É comum implementar métodos que não planejamos usar. Interfaces devem apenas conter atributos e métodos que sejam usados por todas suas subclasses. Devemos definir novas interfaces que abstraiam apropriadamente os diferentes tipos de subclasses.

## Dependency Inversion Principle: 
Sistemas são mais flexíveis quando dependências (classes chamando outras classes) se refere, a abstrações ao invés de classes concretas. Classes devem interagir com interfaces, não com outras classes.

---

# Why Object-Oriented Programming?

We have data (task description) and behavior (toggle task).

- Procedural Programming -> the order of the code is what counts.
- Functional Programming -> data and behavior are separated. We rely on pure functions
- Object Oriented -> data and behavior are together in objects

---

# Design Patterns
São formas de estruturar componentes e como eles se comunicam entre-si. A maioria da manutenção de um software depois que ele é publicado, é relacionada a sua modificação. Podemos adicionar novo código, realizar alterações, ou deletar código. Padrões de Design nos ajudam a adaptar nossos sistemas da melhor forma às mudanças.

Usualmente implementamos um padrão dependendo do tipo de problema que estamos tentando resolver.  

## Types of Design Patterns

### Creational Patterns

Ocultar a lógica de instanciação de uma classe.

Ocultam a lógica necessária para criar um objeto dos clientes que precisam usar o objeto. O padrão Singleton é usado como forma de acessar o banco de dados de qualquer sistema que não precise ser instanciado mais de uma vez; Ele impõe que exista apenas uma instância e evita a criação de instâncias adicionais.

### Structural Patterns

Fornecem maneiras de combinar objetos em estruturas maiores. Cada vez que adicionamos um novo recurso, o número de classes necessárias para representar cada variante, aumenta. Em vez de representar cada variante como uma classe, precisamos criar classes a partir dos tipos dessas variantes e fazer com que nosso objeto base as use como variáveis de instância.

Temos o padrão Bridge, o qual procura substituir parte da responsabilidade da herança (muitas subclasses) pela composição de objetos (transformar objetos a partir de outros tipos de objetos).

### Behavioral Patterns

Definem maneiras claras de os objetos interagirem entre si.

Por exemplo, imagine que queremos ser notificados quando determinados eventos acontecem em um de nossos objetos, como quando um campo é alterado. O padrão Observer , um padrão Comportamental específico, nos permite adicionar novas entidades que escutam esses eventos e criar novos eventos que esses objetos podem ouvir.

## When to use Design Patterns?

Em dois cenários:

1. Quando encontramos um problema que um design pattern tem a intenção de resolver.
2. Quando introduzimos uma parte do sistema que tem chance de mudar repetidamente.

---

# Model View Controller

Muitas vezes chamada MVC, é um design pattern organizacional usado por sistemas que precisam de:

- Transportar dados pelo sistema
- Mostrar elementos visuais e interativos para os usuários.
- Onde os usuários mudam dados no sistema.

Esta arquitetura organiza um sistema em 3 tipos: Model, View, e Controller.

## Model

É feito dos dados armazenados. Dados são usualmente armazenados fora do sistema. Dados podem ser armazenados em formatos diferentes, como em objetos representacionais. Neste caso o Model, num website, seria o armazenamento de nossas informações principais, assim como as classes que as representam.

## View

São as classes que descrevem como nosso sistema será apresentado ao usuário. Estes seriam nossos componentes em React, seriam os botões, formulários, o div onde fazemos o display do Model.

## Controller

Ele é o cérebro de nosso sistema. Enquanto o Model e o View não definem o comportamento de nosso sistema, o Controller define comportamentos que serão realizados por meio do Model e do View. O Controller recebe os eventos (clicks, formulários, escrita), passados desde o View, e os processa. Ele passa queries para o Model.

Model <- Request -> Controller <- User Action -> View
