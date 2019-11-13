# capitulo 3 - Definindo e chamando funções

Tópicos
- Coleções
- Funções 
  - argumentos nomeados
  - valores default
- Extensões
- Funções infixa
- Novas funções para String e Expressões regulares
- estruturação de código com funções de nivel superior, funções locais e propriedades.


## Coleções
 
Kotlin não tem seu proprio conjunto de classes de coleção, ele utiliza as classes de coleção do Java. Assim não é necessário converter as coleções kotlin para java e vice versa quando estamos com interação de código
```kotlin
val set = hashSetOf(1, 2, 3)
//class java.util.HashSet    

val list = arrayListOf(1, 7, 53)
//class java.util.ArrayList

val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
//class java.util.HashMap

var strings = listOf("first", "second", "fourteenth")
//class java.util.Arrays$ArrayList
```

Alguns pontos sobre o código acima:
 - hashSetOf, arrayListOf e hashMapOf são mutaveis
 - listOf é imutavel, tanto que é um Array
 - esse 'to' não é um comando kotlin e sim uma função, que vamos ver mais adiante

### Exemplo de novos metódos para as classes de coleção

Ultimo elemento da lista
```kotlin
val strings = listOf("first", "second", "fourteenth")
println(strings.last())
// fourteenth
```

Maior Número em uma lista de inteiros
```kotlin
val numbers = setOf(1, 14, 2)
println(numbers.max())
//14
```

### Vamos ver abaixo 
- oque são essas funções novas?
- como chamo elas do java

## Funções

### Argumentos nomeados

Funções com muitos paramentros, podem deixar sua chamadas confusas.

*Exemplo 1:*

Assinatura da função
```kotlin
fun <T> joinToString(collection: Collection<T>,
                     separator: String,
                     prefix: String,
                     postfix: String
) : String
``` 

Exemplo de chamadas
```kotlin
joinToString(list, "; ", "(", ")")

joinToString(list, " ", " ", ".")
```

A IDE pode ate te ajudar mostrando o nome dos parametros, mas imagine avaliando um PR... no bitbucket
Para resolver este problema, podemos fazer a chamada especifiando os argumentos:
 ```kotlin
joinToString(list, separator = " ", prefix = " ", postfix = ".")
```

Observações:
- Caso especificado um nome de argumento, devemos especificar o restante se não tomamos um `mixing named and positional arguments is not allowed`
- Caso o método foi feito em java, não temos como usar argumentos nomeados
- No Java, para chamar essa função do Kotlin, temos que chamar passando todos os parametros. ( mais adiante exemplos)

### Valores default
Em programas java, é muito comum sobrecarga de métodos

Exemplo um método de venda, aonde temos a opção de passar o CPF
```java
public boolean vender(List<Produto> produtos) {
    return vender(produtos, "");
}

public boolean vender(List<Produto> produtos, String cpf) {
...
}
```
Isso já tras poluição de código... e agora imagine colocando o javadoc

Em kotlin poderiamos fazer:
```kotlin
fun vender(produtos: Collection<Produto>, cpf: String = "") : boolean
```

O nosso exemplo `joinToString` fica mais elegante:
```kotlin
fun <T> joinToString(collection: Collection<T>,
                     separator: String = "",
                     prefix: String = "",
                     postfix: String = ""
) : String
```

Exemplo de chamadas
```kotlin
joinToString(list)
joinToString(list, "")
joinToString(list, prefix = " ", postfix = ".")
```

Observações:

- Usando a sintaxe de chamada sem nomear os parametros, apenas os ultimos parametros não devem ser especificados
- Usando a sintaxe de chamada nomeando os parametros, a ordem não importa 

#### valores default no java
Como o Java não trabalha com valores default, o compilador deveria gerar as funções com sobrecarga, para isso devemos usar o `@JvmOverloads` acima do método

## Funções de extensão 

Os novos metodos oferecidos pelo kotlin nas coleção, são funções de extensão.

## Varargs
    
funções que aceitam um número arbitrário de argumentos

em kotlin
```kotlin
fun listOf<T>(vararg values: T): List<T> { ... }
```

```java
 ...
```

Colocar um exemplo que parece que o kotlin perde, pois tem que colocar o * mas ai tem o pulo do gato que vc pode passar parametros a mais.


## chamadas infixa

-- infix
-- par
-- destruction

## Expressões regulares
lerrr

## 3.6 Funçoes locais muitas duvidas


## Resumo

- kotlin não define suas proprias bibliotecas de coleção, ele reutiliza a do java, adicionando métodos atraves de extensões.
- parametros default, ajuda a reduzir as sobrecarga de métodos
- funções e propriedades podem ser claradas dentro de um arquivo sem necessidade de uma classe.
- podemos extender a api de qualquer classe, sem modificar o código fonte das mesmas.
- chamadas 'infix' deixam nossas funções de 1 parametros com sintaxe de operador.
- Kotlin da uma porrada de função para string
- Strings com aspas triplas é vida
- Funções locais ajudam você a estruturar o seu códig o de forma mais clara e a eliminar duplicação de código.