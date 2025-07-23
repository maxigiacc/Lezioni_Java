import java.io.*;

public class MainBuffWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        bw.write("Ciao mondo!\n");
        bw.newLine();
        bw.write("Ciao mondo!\n");
        bw.close();


    }
}