public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Impiegato(2000.0);
        Dipendente d2 = new Dirigente(3000.0, 1000.0);

        System.out.println("Impiegato:");
        d1.infoGenerali();
        System.out.println("Stipendio: " + d1.calcolaStipendio() + "€\n");

        System.out.println("Dirigente:");
        d2.infoGenerali();
        System.out.println("Stipendio: " + d2.calcolaStipendio() + "€");
    }
}
