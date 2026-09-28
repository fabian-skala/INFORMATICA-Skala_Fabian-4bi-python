# Recupero di file temporanei già tracciati
## Simulazione dell'errore
    mkdir -p M0_ambiente/temporanei
    touch M0_ambiente/temporanei/nota.txt M0_ambiente/temporanei/bozza.txt
    git add M0_ambiente/temporanei
    git commit -m "Aggiungi cartella temporanei (errore da correggere)"

La cartella contiene i file nota.txt e bozza.txt, entrambi registrati nel commit di simulazione.

# Diagnosi dopo l'aggiunta della regola
    $ git status
    modified:   .gitignore

    git status
    git ls-files M0_ambiente/temporanei
    git check-ignore -v M0_ambiente/temporanei/nota.txt

    # Nessun output: il file è già tracciato.
Correzione
$ git rm --cached -r M0_ambiente_lavoro_ripasso_git/temporanei
rm 'M0_ambiente_lavoro_ripasso_git/temporanei/bozza.txt'
rm 'M0_ambiente_lavoro_ripasso_git/temporanei/nota.txt'

$ git ls-files M0_ambiente_lavoro_ripasso_git/temporanei

# correzione 
    git rm -r --cached M0_ambiente/temporanei
    git add .gitignore
    git commit -m "Rimuovi temporanei dal versionamento e ignorali"
    git ls-files M0_ambiente/temporanei
    ls M0_ambiente/temporanei

I file nota.txt e bozza.txt sono ancora presenti sul disco dopo git rm --cached. La regola .gitignore agisce sui file non tracciati e non rimuove automaticamente quelli già presenti nell'indice Git. Per questo è necessario usare git rm --cached: il comando rimuove i file soltanto dal versionamento, senza cancellarli dalla cartella locale. Dopo la rimozione dall'indice, la regola temporanei/ impedisce che i due file vengano aggiunti di nuovo per errore.