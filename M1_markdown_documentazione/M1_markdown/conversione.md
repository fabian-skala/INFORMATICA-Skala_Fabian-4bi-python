# Conversione della relazione con Pandoc

Questo documento descrive come ho convertito `relazione.md` in un file HTML autonomo e in un file PDF.

## Comando per l'HTML

```bash
pandoc relazione.md -o relazione.html --standalone --embed-resources --toc --toc-depth=2 --metadata title="Relazione di laboratorio: tempi del Bubble Sort" --metadata lang=it
```

## Comando per il PDF

```bash
pandoc relazione.md -o relazione.pdf --pdf-engine=xelatex -V geometry:margin=2.5cm -V fontsize=11pt --metadata lang=it
```

## Opzioni usate

- `-o`: indica il file di uscita; il formato si deduce dall'estensione.
- `--standalone`: produce un documento completo, con intestazione e struttura.
- `--embed-resources`: incorpora immagini e stili nel file, che funziona anche spostato su una chiavetta.
- `--toc`: genera l'indice in cima al documento.
- `--toc-depth=2`: limita l'indice ai titoli fino al secondo livello.
- `--metadata title=...`: imposta il titolo del documento.
- `--metadata lang=it`: dichiara la lingua italiana, usata per la sillabazione e per i testi automatici.
- `--pdf-engine=xelatex`: usa XeLaTeX, che gestisce le lettere accentate.
- `-V geometry:margin=2.5cm`: imposta i margini di 2,5 cm.
- `-V fontsize=11pt`: imposta il corpo del carattere a 11 punti.

## Messaggi di avviso

Nella conversione in HTML non è comparso alcun avviso. Per il PDF: DA COMPLETARE CON LE TRASCRIZIONI DEI MESSAGGI OTTENUTI SUL PROPRIO PC.

## File esclusi dal versionamento

Aggiungi queste righe al file `.gitignore` e controlla con `git status`:

```text
*.html
*.pdf
```
