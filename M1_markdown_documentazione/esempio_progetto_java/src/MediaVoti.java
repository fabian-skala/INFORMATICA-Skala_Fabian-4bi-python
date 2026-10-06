import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class MediaVoti {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ITALY);
        if (args.length != 1) {
            System.out.println("Uso: java -cp bin MediaVoti <file.csv>");
            return;
        }
        Registro registro = new Registro();
        try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
            in.readLine(); // salta l'intestazione
            String riga;
            while ((riga = in.readLine()) != null) {
                String[] campi = riga.split(",");
                Studente s = registro.cercaPerNome(campi[0]);
                if (s == null) {
                    s = new Studente(campi[0]);
                    registro.aggiungiStudente(s);
                }
                s.aggiungiVoto(new Voto(Double.parseDouble(campi[2]), campi[1]));
            }
        } catch (IOException e) {
            System.out.println("Impossibile leggere il file: " + e.getMessage());
            return;
        }
        registro.stampaRiepilogo();
    }
}
