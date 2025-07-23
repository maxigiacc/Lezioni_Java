
import java.util.LinkedList;

public class MainLinked {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("A");
        lista.addFirst("B");
        lista.addLast("C");

        for(int i = 0; i < lista.size(); i++) {
           System.out.println("Nome: " + lista.get(i)); 
        }


    }
}