# Relazione di laboratorio: tempi del Bubble Sort

[Obiettivo](#obiettivo) · [Materiale](#materiale) · [Procedimento](#procedimento) · [Risultati](#risultati) · [Conclusioni](#conclusioni)

## Obiettivo

Misurare il tempo di esecuzione del Bubble Sort su array di dimensione crescente e verificare come cresce al raddoppiare del lavoro richiesto.

## Materiale

- PC con Windows 11 e JDK 17.
- Il file `Ordinamento.java`, che contiene il metodo `bubbleSort` e il programma di misura.
- Un generatore di numeri casuali con seme fisso, per ripetere la prova con gli stessi dati.

## Procedimento

Per ogni dimensione si crea un array di numeri interi casuali, si avvia il cronometro, si ordina l'array e si legge il tempo trascorso. La misura usa `System.nanoTime()` e il risultato viene convertito in millisecondi.[^1]

Il cuore del metodo è la coppia di cicli annidati che confronta gli elementi adiacenti:

```java
for (int i = 0; i < a.length - 1; i++) {
    for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
            int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
        }
    }
}
```

## Risultati

| Dimensione dell'array | Tempo (ms) |
| ---------------------: | ---------: |
| 100                    | 0          |
| 1000                   | 6          |
| 10000                  | 68         |
| 100000                 | 16261      |

Con 100 elementi il tempo è inferiore a un millisecondo e la misura mostra 0.[^2]

## Conclusioni

Quando la dimensione passa da 10000 a 100000, cioè diventa dieci volte più grande, il tempo passa da 68 a 16261 ms, cioè diventa circa 240 volte più grande. Il dato è coerente con una crescita quadratica, in cui il tempo aumenta di circa cento volte quando la dimensione aumenta di dieci volte. Per array grandi il Bubble Sort non è adatto.

[^1]: `System.nanoTime()` misura un intervallo di tempo, non l'ora del giorno.
[^2]: Per misurare tempi così brevi serve la precisione in nanosecondi oppure la ripetizione della prova.
