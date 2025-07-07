// Classe Base (Superclasse)
class Persona {
    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void print() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}

// Classe Derivata (Sottoclasse)
class Studente extends Persona {
    private int matricola;

    public Studente(String nome, int eta, int matricola) {
        super(nome, eta); // Chiama il costruttore della superclasse
        this.matricola = matricola;
    }

    @Override // Ridefinizione del metodo print()
    public void print() {
        super.print(); // Stampa le informazioni base della Persona
        System.out.println("  Matricola: " + matricola); // Aggiunge informazioni specifiche dello Studente
    }

    public static void main(String[] args) {
        System.out.println("--- Esempio Persona/Studente con Polimorfismo ---");

        // Crea un oggetto Studente e lo assegna a una variabile di tipo Persona
        Persona p = new Studente("Anna", 21, 1234); 
        
        System.out.println("\nChiamo p.print():");
        p.print(); // Viene eseguito il print() di Studente, non di Persona!
        /* Output:
         * Nome: Anna, Età: 21
         * Matricola: 1234
         */

        System.out.println("\n-------------------------------------");

        // Esempio con un oggetto Persona "puro"
        Persona p2 = new Persona("Marco", 30);
        System.out.println("\nChiamo p2.print():");
        p2.print(); // Viene eseguito il print() di Persona
        /* Output:
         * Nome: Marco, Età: 30
         */
    }
}