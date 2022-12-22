# Programação Orientada a Objetos

## Definição
A Orientação a Objetos é um paradigma de análise,
projeto e programação de sistemas de software
baseado na composição e interação entre
diversas  unidades de software
chamadas de objetos.

## Fundamentos

- Abstração: "Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos."

- Reuso: "Capacidade de criar novas unidades de código a partir de outras já existentes."

- Encapsulamento: "Capacidade de esconder complexidades e proteger dados."

## Estrutura

### Classe

"É uma estrutura que abstrai um conjunto de objetos com
características similares. Uma classe define o comportamento
de seus objetos através de métodos e os estados possíveis
destes objetos através de atributos. Em outros termos, uma
classe descreve os serviços providos por seus objetos e quais
informações eles podem armazenar."

- Exemplos: carro, bola, venda, viagem, comprador, computador

#### Dicas:

- Substantivos
- Nome significativos
- Contexto deve ser considerado

#### Codigo:

```java
class Carro {

}
```

### Atributo

"É o elemento de uma classe responsável por definir sua
estrutura de dados. O conjunto destes será responsável
por representar suas características e fará parte dos
objetos criados a partir da classe." 

- Exemplos: Carro-Cor, Bola-Diametro, Venda-Vlor, Viagem-Distancia, Comprador-nome, Computador-Memoria

#### Dicas:

- Substantivos e adjetivos
- Nome significativos
- Contexto deve ser considerado
- Abstração
- Tipos adequados

#### Códigos:

```java
class Carro {
    int portas;
}
```

### Método

"É uma porção de código (sub-rotina) disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações,
que a classe oferece. Eles são responsáveis por definir
e realizar um determinado comportamento" 

- Exemplos: Carro-ligar, Venda-calcular total, Computador-desligar, Comprador-realizar troca

#### Criação:

- Visibilidade
- Retorno
- Nome
- Parâmetros

#### Dicas:

- Verbos
- Nome significativos
- Contexto deve ser considerado

#### Códigos:

```java
class Carro {
    void frear(){
        
    }
}
```

#### Dois métodos especiais:

- Construtor

```java
class Carro {
    Carro(){
        
    }
}
```
- Destrutor

```java
class Carro {
    void finalize(){
        
    }
}
```

##### sobregarga

Mudar a assinatura conforme a necessidade
Assinatura: nome + parâmetros

m1()

m1(int i)

m1(float f)

m1(String s, long l)

m1(long l, String s)

### Objeto

"Um objeto é a representação de um conceito/entidade do mundo
real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse
conceito/entidade, deve ser definida inicialmente
uma classe a partir da qual posteriormente serão
instanciados objetos distintos."

#### Criação:

```java
Carro carro = new Carro();
```
### Mensagem

"É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução  de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático."

```java
Carro carro = new Carro();
carro.<método>;
Carro.<método>;
```








