import java.io.*;
import java.util.*;

public class Es2 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> rubrica = new HashMap<>();
        rubrica.put("Marco", "1234567890");
        rubrica.put("Anna", "0987654321");
        rubrica.put("Luca", "1112223333");

        // Scrivi su file
        try (PrintWriter writer = new PrintWriter("rubrica.txt")) {
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        // Cerca nome
        String nome = args[0];
        System.out.print("Nome da cercare inserito: " + nome);
        String numero = rubrica.get(nome);
        if (numero != null)
            System.out.println("Numero di " + nome + ": " + numero);
        else
            System.out.println("Nome non trovato.");
    }
}
