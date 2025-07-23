import java.util.*;

public class MainHashSet {

    public static void main(String[] args) {
        Set<String> colori = new HashSet<>();

        colori.add("Rosso");
        colori.add("Giallo");
        colori.add("Verde");

        if (colori.isEmpty())
            System.out.println("Insieme vuoto");

        System.out.println(colori);
        
        List<String> nomi = new ArrayList<>();
        nomi.add("Luca");
        nomi.add("Maria");
        nomi.add("Massimo");
        nomi.add("Lucia");

        colori.addAll(nomi);

        System.out.println(colori);
        colori.remove("Luca");
        System.out.println(colori);
        colori.clear();
        System.out.println(colori);
    }
}