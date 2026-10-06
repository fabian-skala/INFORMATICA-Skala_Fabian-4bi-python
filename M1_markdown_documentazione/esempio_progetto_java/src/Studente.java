import java.util.ArrayList;

public class Studente {
    private String nome;
    private ArrayList<Voto> voti;

    public Studente(String nome) {
        this.nome = nome;
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(Voto v) {
        voti.add(v);
    }

    public double media() {
        double somma = 0;
        for (Voto v : voti) {
            somma += v.getValore();
        }
        return somma / voti.size();
    }

    public String getNome() {
        return nome;
    }
}
