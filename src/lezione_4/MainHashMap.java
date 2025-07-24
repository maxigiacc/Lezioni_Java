import java.util.*;
public class MainHashMap {

    public static void main(String[] args) {
        //  chiave - valore  --> entry/elemento di una mappa
        Map<String, Integer> eta = new HashMap<>();
        eta.put("Luca", 22);
        eta.put("Anna", 25);

        System.out.println(eta);

        eta.put("Luca", 27);
        System.out.println(eta);
        //garanzia dell'unicità delle chiavi

        System.out.println(eta.get("Luca"));
    }
}