import java.util.*;

public class Es7 {
    public static void main(String[] args) {
        Map<String, Integer> voti = new HashMap<>();
        voti.put("Matematica", 28);
        voti.put("Informatica", 30);
        voti.put("Fisica", 26);

        // Ordinamento per materia (alfabetico)
        Map<String, Integer> ordinati = new TreeMap<>(voti);

        for (Map.Entry<String, Integer> entry : ordinati.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Calcolo media
        double somma = 0;
        for (int voto : voti.values()) {
            somma += voto;
        }

        double media = somma / voti.size();
        System.out.println("Media: " + media);
    }
}
