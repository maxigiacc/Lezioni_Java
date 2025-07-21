import java.io.*;
import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        // Con Scanner
        try (Scanner sc = new Scanner(new File("nomi.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
        }

        // Con BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("nomi.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file.");
        }
    }
}
