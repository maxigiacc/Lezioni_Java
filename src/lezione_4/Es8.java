import java.util.*;

class Libro {
    private String titolo;
    private String autore;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return titolo + " - " + autore;
    }
}

public class Es8 {
    public static void main(String[] args) {
        List<Libro> libri = Arrays.asList(
            new Libro("Il Signore degli Anelli", "Tolkien"),
            new Libro("1984", "Orwell"),
            new Libro("Divina Commedia", "Dante")
        );

        libri.sort(Comparator.comparing(Libro::getAutore));
        
        libri.sort(new Comparator<Libro>() {
            @Override
            public int compare(Libro s1, Libro s2) {
                return s1.getAutore().compareTo(s2.getAutore());
            }
        });

        for (Libro libro : libri) {
            System.out.println(libro);
        }
    }
}
