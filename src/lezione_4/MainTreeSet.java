import java.util.*;
public class MainTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> numeri = new TreeSet<>();
        numeri.add(4);
        numeri.add(5);
        numeri.add(4);
        numeri.add(1);
        System.out.println(numeri);
        System.out.println(numeri.first());
        System.out.println(numeri.last());
        System.out.println(numeri.ceiling(Integer.valueOf(10)));
        System.out.println(numeri.floor(Integer.valueOf(10)));
    }
}