# Mostrare un blocco di codice dentro un altro blocco

Un blocco di codice si apre e si chiude con una riga di tre apici inversi. Per mostrare quei tre apici come testo, il recinto esterno deve usarne di più.

## Primo esempio: un blocco `java` normale

Il lettore vedrà un riquadro con colorazione sintattica Java e il codice di un programma.

```java
public class Saluto {
    public static void main(String[] args) {
        System.out.println("Ciao");
    }
}
```

## Secondo esempio: il sorgente del primo esempio

Il lettore vedrà il testo con cui è stato scritto il primo esempio, compresi i tre apici di apertura e di chiusura. Il recinto esterno usa quattro apici, quindi quelli interni non lo chiudono.

````markdown
```java
public class Saluto {
    public static void main(String[] args) {
        System.out.println("Ciao");
    }
}
```
````

## Terzo esempio: il sorgente del secondo esempio

Il lettore vedrà il testo con cui è stato scritto il secondo esempio, compresi i quattro apici. Il recinto esterno usa cinque apici, uno in più del livello che contiene.

`````markdown
````markdown
```java
public class Saluto {
    public static void main(String[] args) {
        System.out.println("Ciao");
    }
}
```
````
`````

## Regola da ricordare

Il recinto esterno deve avere sempre almeno un apice inverso in più del recinto più lungo che contiene. Questo paragrafo è testo normale: se lo vedi come codice, un recinto è rimasto aperto.
