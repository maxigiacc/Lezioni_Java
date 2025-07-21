class SaldoInsufficienteException extends Exception {
    public SaldoInsufficienteException(String msg) {
        super(msg);
    }
}

class Salvadanaio {
    private int saldo;

    public Salvadanaio(int saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public void preleva(int x) throws SaldoInsufficienteException {
        if (x > saldo) {
            throw new SaldoInsufficienteException("Saldo insufficiente. Disponibile: " + saldo);
        }
        saldo -= x;
        System.out.println("Prelevato: " + x + ", Saldo residuo: " + saldo);
    }
}

class TestSalvadanaio {
    public static void main(String[] args) {
        Salvadanaio s = new Salvadanaio(100);
        try {
            s.preleva(30);
            s.preleva(80); // Genererà eccezione
        } catch (SaldoInsufficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
