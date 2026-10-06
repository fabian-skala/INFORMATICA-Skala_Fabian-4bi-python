# MediaVoti

MediaVoti legge da un file CSV i voti degli studenti e stampa a video la media di ciascuno. Indica anche se la media è sufficiente o insufficiente. È scritto in Java e usa tre classi: `Voto`, `Studente` e `Registro`.

## Requisiti

| Componente | Versione minima | Come verificare        |
| :--------- | :-------------- | :--------------------- |
| JDK        | 17              | `javac -version`       |
| Git        | 2.30            | `git --version`        |
| Terminale  | `bash`          | qualsiasi terminale `bash` |

## Installazione

1. Clona il repository e entra nella cartella:

   ```bash
   git clone https://github.com/utente/mediavoti.git
   cd mediavoti
   ```

2. Crea la cartella di destinazione e compila i sorgenti:

   ```bash
   mkdir -p bin
   javac -d bin src/*.java
   ```

3. Controlla che in `bin/` ci siano i file `.class`:

   ```bash
   ls bin
   ```

## Uso

Lancia il programma indicando il file CSV come unico argomento:

```bash
java -cp bin MediaVoti dati/voti.csv
```

Il file di ingresso ha una riga di intestazione e poi una riga per ogni voto, con tre campi separati da virgola: nome dello studente, materia, voto. Il separatore decimale del voto è il punto.

```text
nome,materia,voto
Rossi,Informatica,7
Rossi,Matematica,6
Rossi,Inglese,8
Bianchi,Informatica,5
Bianchi,Matematica,4.5
Verdi,Informatica,9
Verdi,Inglese,8
```

Con questo file il programma stampa:

```text
Rossi: media 7,00 (sufficiente)
Bianchi: media 4,75 (insufficiente)
Verdi: media 8,50 (sufficiente)
```

Se non indichi il file, il programma mostra la sintassi corretta. Se il file non esiste, mostra un messaggio di errore e termina.

## Struttura del progetto

```text
mediavoti/
├── src/
│   ├── MediaVoti.java
│   ├── Registro.java
│   ├── Studente.java
│   └── Voto.java
├── dati/
│   └── voti.csv
├── bin/            (generata dalla compilazione, non versionata)
└── README.md
```

## Autore e licenza

Autore: NOME COGNOME, classe 4Bi, ITT "G. Marconi" di Rovereto.

Licenza: MIT.
