# BOAS PRÁTICAS

## Escolha nomes significativos, evitando x, y...

```java
int idade = 25; 
int i = 25; //bad
``` 

---

## Comece com minuscula para nome de variáveis, maiuscula é só para classes 

```java
float precoProduto = 99.99f;
float PrecoProduto = 99.99f; //bad
```
--- 

## Inicialize as variaveis, declare com um valor.

```java
int contador = 0;
int contador;//bad
```
---

## Use constantes, sempre que apropriado
```java
final double PI = 3.1415;
```
---

## Prefira tipos primitivos, quando possivel
> poupa memória

```java
int numero = 10;
Integer numero = 10; //bad
```
---

### Evite variaveis globais desnecessárias

```java
public class Examp {
    private int contador;
}
``` 
> Ok, se for usado apenas nessa classe 

## Só use `var` se o tipo estiver claro
```java
var nome = "Cicrano"; //claro que é string
var resultado = calcular(); //bad
```
---



