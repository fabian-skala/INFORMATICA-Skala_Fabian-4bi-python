# Le varianti di Markdown a confronto

La tabella confronta tre varianti: Markdown originale, CommonMark e GitHub Flavored Markdown (GFM).

| Costrutto               | Markdown originale | CommonMark | GFM |
| :---------------------- | :----------------: | :--------: | :-: |
| Blocchi di codice recintati | no             | sì         | sì  |
| Tabelle                 | no                 | no         | sì  |
| Caselle di spunta       | no                 | no         | sì  |
| Testo barrato           | no                 | no         | sì  |
| Collegamenti automatici | solo con `<...>`   | solo con `<...>` | sì, anche senza `<...>` |
| Note a piè di pagina    | no                 | no         | solo su GitHub |

## Esempi delle estensioni di GFM

### Caselle di spunta

- [x] Installare Visual Studio Code
- [x] Creare il repository personale
- [ ] Scrivere la scheda della postazione
- [ ] Scrivere le istruzioni di compilazione
- [ ] Consegnare la pagina delle risorse
- [ ] Preparare il README finale

### Testo barrato

Il progetto usa Java 17.

### Collegamento automatico

Scrivo l'indirizzo per esteso: https://github.com. Su GitHub diventa cliccabile senza altra sintassi.

## Quale variante usare

Per le consegne del corso conviene usare GitHub Flavored Markdown, perché i file vengono letti soprattutto su GitHub. Questa variante offre le tabelle, le caselle di spunta e i diagrammi che il modulo richiede. Inoltre l'anteprima che vedo su GitHub coincide con quella che vede il docente. Se apro questo stesso file con uno strumento che implementa solo CommonMark, la tabella non viene riconosciuta e appare come testo con le barre verticali. Le caselle restano visibili come parentesi quadre e il testo barrato mostra le tilde. L'indirizzo scritto per esteso non diventa un collegamento. Nell'anteprima di Visual Studio Code ho osservato queste differenze: DA COMPLETARE DOPO AVER CONTROLLATO L'ANTEPRIMA.
