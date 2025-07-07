// Classe Base (Superclasse)
class Counter {
    // L'attributo 'val' è dichiarato come private
    private int val;

    public Counter() {
        this.val = 0;
    }

    public void increment() {
        this.val++;
        System.out.println("Counter incrementato a: " + this.val);
    }

    public int getValue() {
        return this.val;
    }
}

// Classe Derivata (Sottoclasse)
class Counter2 extends Counter {
    public Counter2() {
        super(); // Chiama il costruttore della superclasse
    }

    // Metodo per decrementare il contatore
    public void dec() {
        // ERRORE DI COMPILAZIONE! 'val' ha accesso privato in 'Counter'
        //this.val--; 
        //System.out.println("Errore: Impossibile accedere direttamente a 'val' perché è privato.");
        //System.out.println("Per decrementare, sarebbe necessario un metodo pubblico nella superclasse o modificare l'accesso di 'val'.");
    }

    public static void main(String[] args) {
        System.out.println("--- Esempio di Ereditarietà e Incapsulamento ---");

        Counter2 myCounter = new Counter2();
        System.out.println("Valore iniziale del contatore: " + myCounter.getValue());

        myCounter.increment(); // Metodo ereditato
        System.out.println("Valore dopo incremento: " + myCounter.getValue());

        // Tentativo di decremento (causerà un errore di compilazione se la riga this.val-- è decommentata)
        myCounter.dec(); 
        
        System.out.println("Valore finale del contatore: " + myCounter.getValue()); // Sarà ancora 1 se l'incremento è andato a buon fine
    }
}