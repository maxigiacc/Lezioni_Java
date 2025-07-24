import java.util.*;
public class MainIterator {

    public static void main(String[] args) {
        Set<String> nomi = Set.of("Massimo", "Fabio", "Gianni", "Fausto");
        Iterator<String> it = nomi.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}