class Counter {
    protected int val; // Usiamo protected per permettere l'accesso da sottoclassi

    public Counter() {
        this.val = 0;
    }

    public void inc() {
        this.val++;
        System.out.println("Counter: Incrementato a " + this.val);
    }

    public int getValue() {
        return this.val;
    }
}

class Counter2 extends Counter {
    // Override del metodo inc()
    @Override
    public void inc() {
        super.inc(); // Chiama l'incremento della superclasse
        System.out.println("Counter2: Logica aggiuntiva dopo l'incremento.");
    }

    // Nuovo metodo specifico di Counter2
    public void dec() {
        this.val--;
        System.out.println("Counter2: Decrementato a " + this.val);
    }

    public static void main(String[] args) {
        // Polimorfismo in azione: una variabile di tipo superclasse punta a un oggetto sottoclasse
        Counter c = new Counter2(); 
        System.out.println("Valore iniziale (tramite c): " + c.getValue()); // Output: 0

        System.out.println("\nChiamo c.inc():");
        c.inc(); // Anche se c è Counter, viene chiamato inc() di Counter2
                 // Output: Counter: Incrementato a 1
                 // Output: Counter2: Logica aggiuntiva dopo l'incremento.
        
        System.out.println("Valore dopo inc() (tramite c): " + c.getValue()); // Output: 1

        // Notare: Non è possibile chiamare c.dec() direttamente,
        // perché il tipo dichiarato di c è Counter, che non ha il metodo dec().
        // Per chiamare dec(), sarebbe necessario un cast esplicito a Counter2:
        // ((Counter2) c).dec(); 
    }
}