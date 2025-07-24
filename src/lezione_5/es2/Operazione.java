// Interfaccia
interface Operazione {
    int esegui(int a, int b);
}

// Classe Somma
class Somma implements Operazione {
    @Override
    public int esegui(int a, int b) {
        return a + b;
    }
}

// Classe Moltiplicazione
class Moltiplicazione implements Operazione {
    @Override
    public int esegui(int a, int b) {
        return a * b;
    }
}

// Classe con metodo generico
class Calcolatrice {
    public static void eseguiOperazione(Operazione op, int a, int b) {
        int risultato = op.esegui(a, b);
        System.out.println("Risultato: " + risultato);
    }
}
