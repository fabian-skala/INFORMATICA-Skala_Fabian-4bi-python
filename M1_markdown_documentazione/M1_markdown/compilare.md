# Compilare ed eseguire un programma Java da un repository clonato

Queste istruzioni valgono per un progetto con i sorgenti nella cartella `src/`, da compilare nella cartella `bin/`. La classe con il metodo `main` si chiama `MediaVoti`.

## Procedura

1. Apri un terminale `bash` e verifica che il JDK sia installato:

   ```bash
   javac -version
   ```

2. Clona il repository e entra nella cartella del progetto:

   ```bash
   git clone https://github.com/utente/progetto.git
   cd progetto
   ```

3. Controlla che la struttura contenga i file necessari:
   - la cartella `src/` con i file `.java`;
   - la cartella `dati/` con il file `voti.csv`;
   - nessuna cartella `bin/` già compilata: la creerai al passo successivo.
4. Crea la cartella `bin/` e compila tutti i sorgenti con l'opzione `-d`, che indica dove scrivere i file `.class`:

   ```bash
   mkdir -p bin
   javac -d bin src/*.java
   ```

5. Esegui la classe `MediaVoti` indicando con l'opzione `-cp` dove trovare i file compilati:

   ```bash
   java -cp bin MediaVoti dati/voti.csv
   ```

## Se il JDK non è installato

Al passo 1 il terminale mostra questo messaggio:

> bash: javac: command not found

Installa il JDK 17, riapri il terminale e ripeti il comando `javac -version` finché non compare il numero di versione.
