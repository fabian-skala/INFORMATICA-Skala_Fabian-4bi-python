# Autenticazione GitHub
## Metodo scelto
Per il repository è stata scelta l'autenticazione SSH, usando la chiave pubblica associata al file ~/.ssh/id_ed25519_github.pub.

Questa è una postazione personale usata per tutto l'anno scolastico, quindi una chiave SSH è più comoda per eseguire push ripetuti senza gestire token personali nell'URL del repository. La chiave è inoltre registrata nel portachiavi del Mac e resta separata dal codice del progetto. L'URL remoto usa il formato SSH git@github.com:....

## Verifica
Il comando richiesto è stato eseguito con successo:

    $ ssh -T git@github.com
    Hi fabianskala-code! You've successfully authenticated, but GitHub does not provide shell access.

Anche il push di prova è riuscito: il commit 5496321 è stato pubblicato sul ramo main del repository GitHub. Non sono riportati token né contenuti di chiavi private.