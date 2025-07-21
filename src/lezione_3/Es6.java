import java.io.*;

public class Es6 {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Conversione completata.");
        } catch (IOException e) {
            System.out.println("Errore durante lettura o scrittura.");
        }
    }
}
