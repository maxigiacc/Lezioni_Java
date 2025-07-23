import java.util.*;

public class Es5 {
    public static void main(String[] args) {
        List<String> parole = Arrays.asList("ciao", "programmazione", "java", "esercizi", "università");

        String[] array = parole.toArray(new String[0]);

        for (String parola : array) {
            if (parola.length() > 5) {
                System.out.println(parola);
            }
        }
    }
}
