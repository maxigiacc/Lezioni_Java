import java.util.*;

public class Es1 {
    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<>();
        studenti.add("Marco");
        studenti.add("Anna");
        studenti.add("Luca");

        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }
    }
}
