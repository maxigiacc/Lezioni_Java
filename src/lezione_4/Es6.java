import java.io.*;
import java.util.*;

public class Es6 {
    public static void main(String[] args) throws IOException {
        Set<String> nomi = new HashSet<>();

        // Leggi da file (nome file: nomi.txt)
        try (BufferedReader br = new BufferedReader(new FileReader("nomi.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nomi.add(linea.trim());
            }
        }

        // Ordina con TreeSet
        Set<String> ordinati = new TreeSet<>(nomi);
        for (String nome : ordinati) {
            System.out.println(nome);
        }
    }
}
