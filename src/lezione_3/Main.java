import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = null;
        try {
            File f = new File("dati.txt");
            scanner = new Scanner(f);    
            
            while (scanner.hasNextLine()) { 
                String riga = scanner.nextLine();
                System.out.println(riga);
            }   
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        } catch (NoSuchElementException e ) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        
    }
}