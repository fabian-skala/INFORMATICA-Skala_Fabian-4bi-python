# Notebook eseguito fuori ordine

## Ordine reale di esecuzione

Le celle sono state eseguite nell'ordine indicato dai numeri fra parentesi quadre: prima la cella `[1]` (l'ultima del file, con `iscritti = 22`), poi la `[2]` (la prima del file), poi la `[3]` e infine la `[4]`. Il numero cresce a ogni esecuzione, quindi non dipende dalla posizione della cella nel notebook.

## Perché `[4]` mostra 22

Quando è stata eseguita la cella `[3]`, la variabile `posti` valeva ancora 24, perché la sottrazione non era ancora avvenuta. La cella `[4]` è stata eseguita dopo: ha letto 24, ha sottratto 2 e ha stampato 22. Per questo `[3]` calcola `24 - 22 = 2` e `[4]` mostra 22.

## Output dopo Restart Kernel and Run All Cells

Il kernel esegue le celle dall'alto in basso, nell'ordine in cui sono scritte nel file. La prima cella imposta `aula` e `posti`. La seconda stampa:

```text
Posti disponibili: 22
```

La terza cella usa `iscritti`, che non esiste ancora, e si ferma con un errore. La quarta cella non viene eseguita affatto.

## Quale cella produce un errore

Produce l'errore la terza cella del file, quella con `print(aula, "-", "liberi:", posti - iscritti)`. Il messaggio è:

```text
NameError: name 'iscritti' is not defined
```

## Come correggere il notebook

Sposta la cella con `iscritti = 22` prima della cella che stampa `liberi:`, per esempio in cima al file. Dall'alto in basso il notebook arriva in fondo senza errori. Il valore però cambia: la cella con `posti = posti - 2` viene eseguita prima di quella dei liberi, quindi `posti` vale 22 e al posto di `liberi: 2` compare `liberi: 0`.

```text
Laboratorio 3 - liberi: 0
```

Per ottenere ancora 2 bisogna riprodurre l'ordine originale: `iscritti`, poi `aula` e `posti`, poi la stampa dei liberi, infine la sottrazione.
