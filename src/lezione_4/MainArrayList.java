import java.util.ArrayList;
import java.util.*;

public class MainArrayList{

    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Luca");
        nomi.add("Maria");
        nomi.add("Massimo");
        nomi.add("Lucia");
        for(int i = 0; i < nomi.size(); i++) {
           System.out.println("Nome: " + nomi.get(i)); 
        }
        System.out.println("SECONDa");
        nomi.add(0, "Gianni");

        for(int i = 0; i < nomi.size(); i++) {
           System.out.println("Nome: " + nomi.get(i)); 
        }

        System.out.println("REMOVE");
        nomi.remove(2);
        for(int i = 0; i < nomi.size(); i++) {
           System.out.println("Nome: " + nomi.get(i)); 
        }

        System.out.println("SET");
        nomi.set(0, "Marcp");
        for(int i = 0; i < nomi.size(); i++) {
           System.out.println("Nome: " + nomi.get(i)); 
        }


        List<String> sottoLista = nomi.subList(1, 3);
        System.out.println("SOTTOLISTA");
        for(int i = 0; i < sottoLista.size(); i++) {
           System.out.println("Nome: " + sottoLista.get(i)); 
        }

    }
}