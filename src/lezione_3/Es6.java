import java.io.*;

public class Es6 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            } 
            System.out.println("Conversione completata!");
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Errore durante lettura o scrittura");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File non trovato!");
        }
    }
}