import java.util.*;
public class MainForEach {

    public static void main(String[] args) {
        Set<String> nomi = Set.of("Massimo", "Fabio", "Gianni", "Fausto");
        List<String> n = new ArrayList<>();
        n.add("Massimo");

        for (String nome : nomi) {
            System.out.println(nome);
        }

        System.out.println(nomi);

    }
}