import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Es5 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("risultato.txt"))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("Riga " + i);
                writer.newLine();
                writer.close();
            }
            System.out.println("Scrittura completata.");
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file.");
        }
    }
}
