import java.io.*;
import java.util.Scanner;

public class Es7 {
    public static void main(String[] args) {
        int somma = 0;
        try (Scanner sc = new Scanner(new File("numeri.txt"))) {
            while (sc.hasNext()) {
                try {
                    somma += Integer.parseInt(sc.next());
                } catch (NumberFormatException e) {
                    System.out.println("Numero mal formattato ignorato.");
                }
            }
            System.out.println("Somma totale: " + somma);
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file numeri.txt non trovato.");
        }
    }
}
