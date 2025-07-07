public class Contatore1 {
    private int valore;

    // Costruttore
    public Contatore1() {
        this.valore = 0;
    }

    // Metodo per incrementare il contatore
    public void incrementa() {
        this.valore++;
    }

    // Metodo per ottenere il valore corrente
    public int getValore() {
        return this.valore;
    }

    public static void main(String[] args) {
        System.out.println("--- Esempio di Riferimenti Condivisi ---");

        // 1. Creazione del primo oggetto Contatore e del riferimento c1
        Contatore1 c1 = new Contatore1();
        System.out.println("Valore iniziale di c1: " + c1.getValore()); // Output: 0

        // 2. Creazione di un nuovo riferimento c2 che punta allo stesso oggetto di c1
        Contatore1 c2 = c1;
        System.out.println("Valore di c2 (dopo assegnazione a c1): " + c2.getValore()); // Output: 0

        // 3. Incremento del contatore tramite il riferimento c2
        System.out.println("\nIncremento il contatore tramite c2...");
        c2.incrementa();

        // 4. Stampa dei valori di c1 e c2: entrambi riflettono la modifica
        System.out.println("Valore di c1 dopo incremento tramite c2: " + c1.getValore()); // Output: 1
        System.out.println("Valore di c2 dopo incremento tramite c2: " + c2.getValore()); // Output: 1

        System.out.println("\n--- Creazione di una Copia Indipendente ---");

        // Esempio per creare una copia indipendente (non un riferimento condiviso)
        Contatore c3 = new Contatore(); // Crea un nuovo oggetto
        c3.incrementa(); // Incrementa il nuovo oggetto
        System.out.println("Valore iniziale di c3: " + c3.getValore()); // Output: 1

        Contatore c4 = new Contatore(); // Crea un oggetto completamente nuovo e indipendente
        // Per copiare i valori, si dovrebbe fare: c4.setValore(c3.getValore()); se setValore esistesse
        System.out.println("Valore iniziale di c4 (nuovo oggetto): " + c4.getValore()); // Output: 0

        // Se modifico c3, c4 rimane invariato (sono oggetti distinti)
        c3.incrementa();
        System.out.println("Valore di c3 dopo altro incremento: " + c3.getValore()); // Output: 2
        System.out.println("Valore di c4 (rimasto invariato): " + c4.getValore()); // Output: 0
    }
}