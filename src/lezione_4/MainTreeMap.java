import java.util.*;
public class MainTreeMap {

    public static void main(String[] args) {
        Map<String, Integer> voti = new TreeMap<>();
        
        voti.put("Fisica", 28);
        voti.put("Informatica", 18);
        voti.put("Analisi", 25);
        System.out.println(voti);

        Map<Integer, String> v = new TreeMap<>();
        
        v.put(28, "Fisica");
        v.put(18, "Informatica");
        v.put(25, "Analisi");
        System.out.println(v);
    }
}