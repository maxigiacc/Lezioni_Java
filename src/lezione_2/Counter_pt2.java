// Classe Base (Superclasse)
class Counter {
    // L'attributo 'val' è ora protected per consentire l'accesso diretto alle sottoclassi
    protected int val; 

    // Costruttore di default per Counter
    public Counter() {
        this.val = 0;
        System.out.println("Costruttore Counter() chiamato. Valore iniziale: " + this.val);
    }

    // Costruttore parametrizzato per Counter
    public Counter(int initialValue) {
        this.val = initialValue;
        System.out.println("Costruttore Counter(int) chiamato. Valore iniziale: " + this.val);
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

    // Costruttore di default per Counter2
    public Counter2() {
        super(); // Chiama il costruttore Counter() della superclasse
        System.out.println("Costruttore Counter2() chiamato.");
    }

    // Costruttore parametrizzato per Counter2
    public Counter2(int initialValue) {
        super(initialValue); // Chiama il costruttore Counter(int) della superclasse
        System.out.println("Costruttore Counter2(int) chiamato.");
    }

    // Nuovo metodo per decrementare, ora può accedere a 'val' perché è protected
    public void dec() {
        this.val--; 
        System.out.println("Counter2 decrementato a: " + this.val);
    }

    public static void main(String[] args) {
        System.out.println("--- Test di Counter2 con Costruttore di Default ---");
        Counter2 c1 = new Counter2(); // Chiamerà Counter() -> Counter2()
        System.out.println("Valore c1 dopo creazione: " + c1.getValue());
        c1.increment(); // Metodo ereditato
        c1.dec();       // Nuovo metodo
        System.out.println("Valore c1 finale: " + c1.getValue());

        System.out.println("\n--- Test di Counter2 con Costruttore Parametrizzato ---");
        Counter2 c2 = new Counter2(10); // Chiamerà Counter(10) -> Counter2(10)
        System.out.println("Valore c2 dopo creazione: " + c2.getValue());
        c2.dec();       // Nuovo metodo
        c2.increment(); // Metodo ereditato
        c2.increment(); // Metodo ereditato
        System.out.println("Valore c2 finale: " + c2.getValue());
    }
}