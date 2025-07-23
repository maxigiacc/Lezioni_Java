import java.util.*;

class Persona implements Comparable<Persona> {
    private String nome;
    private double reddito;

    public Persona(String nome, double reddito) {
        this.nome = nome;
        this.reddito = reddito;
    }

    public String getNome() {
        return nome;
    }

    public double getReddito() {
        return reddito;
    }

    @Override
    public int compareTo(Persona altra) {
        return Double.compare(this.reddito, altra.reddito); // ordinamento naturale per reddito
    }

    @Override
    public String toString() {
        return nome + " - Reddito: " + reddito;
    }
}

public class Es3 {
    public static void main(String[] args) {
        List<Persona> persone = Arrays.asList(
            new Persona("Marco", 30000),
            new Persona("Anna", 40000),
            new Persona("Luca", 25000)
        );

        Collections.sort(persone); // ordinamento naturale
        System.out.println("Ordinati per reddito:");
        persone.forEach(System.out::println);

        persone.sort(Comparator.comparing(Persona::getNome));
        System.out.println("\nOrdinati per nome:");
        persone.forEach(System.out::println);
    }
}
