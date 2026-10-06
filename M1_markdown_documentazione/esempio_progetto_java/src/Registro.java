import java.util.ArrayList;

public class Registro {
    private ArrayList<Studente> studenti;

    public Registro() {
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente s) {
        studenti.add(s);
    }

    public Studente cercaPerNome(String nome) {
        for (Studente s : studenti) {
            if (s.getNome().equals(nome)) {
                return s;
            }
        }
        return null;
    }

    public void stampaRiepilogo() {
        for (Studente s : studenti) {
            double m = s.media();
            String esito;
            if (m >= 6) {
                esito = "sufficiente";
            } else {
                esito = "insufficiente";
            }
            System.out.printf("%s: media %.2f (%s)%n", s.getNome(), m, esito);
        }
    }
}
