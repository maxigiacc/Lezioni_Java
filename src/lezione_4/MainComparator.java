import java.util.*;
class Studente {
    protected String nome;
    protected int matricola;

    public Studente (String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.nome + " " + this.matricola);
        return str.toString();
    }
}

public class MainComparator {
    public static void main(String[] args) { 
        List<Studente> studenti = Arrays.asList( 
            new Studente("Massimo", 12),
            new Studente("Gianni", 1),
            new Studente("Fausto", 76)
        );

        studenti.sort( new Comparator<Studente>() {
            @Override
            public int compare(Studente s1, Studente s2) {
                return -(s1.getNome().compareTo(s2.getNome()));
            }
        });

        System.out.println("ORDINATI");        
        for(Studente s: studenti) {
            System.out.println(s);
        }
    }

}