import java.io.*;

public class MainWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("output.txt"));
        fw.write("Ciao mondo!\n");
        fw.write("Fa caldo!\n");
        fw.write("Domani si parte!\n");

        fw.close();

    }
}