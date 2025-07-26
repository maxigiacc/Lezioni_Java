import java.util.*;

class Studente implements Comparable<Studente> {
    protected String nome;
    protected int matricola;

    public Studente (String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }
    @Override
    public int compareTo(Studente s) {
        return -(this.matricola - s.matricola);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.nome + " " + this.matricola);
        return str.toString();
    }
}

class Main {

    public static void main(String[] args) {
        List<Studente> studenti = Arrays.asList( 
            new Studente("Massimo", 12),
            new Studente("Gianni", 1),
            new Studente("Fausto", 76)
        );

        Collections.sort(studenti);
        for(Studente s: studenti) {
            System.out.println(s);
        }
    }
}