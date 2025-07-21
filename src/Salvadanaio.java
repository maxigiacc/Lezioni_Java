public class Salvadanaio {

    private int saldo;

    public Salvadanaio(int saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public void preleva (int x) throws SaldoInsufficienteException {
        if (x > this.saldo) {
            throw new SaldoInsufficienteException("Saldo insufficiente. Disponibile: " + this.saldo);
        }
        this.saldo = this.saldo - x;
        System.out.println("Prelevato: " + x + ", Saldo residuo: " + this.saldo);
    }
}