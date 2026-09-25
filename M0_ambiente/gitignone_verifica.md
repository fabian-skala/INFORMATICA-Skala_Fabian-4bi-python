# ES 7

## comandi 


git add .gitignore

git commit -m "Aggiunge .gitignore per cache Python, venv, notebook e file Windows"

py -3.14 -m venv M0_ambiente\.venv

git status

git check-ignore -v M0_ambiente/.venv/pyvenv.cfg

## output

     .gitignore:7:.venv/ M0_ambiente/.venv/pyvenv.cfg