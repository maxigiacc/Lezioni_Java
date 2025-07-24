public class Main {
    public static void main(String[] args) {
        Operazione somma = new Somma();
        Operazione moltiplicazione = new Moltiplicazione();

        System.out.println("Eseguo Somma:");
        Calcolatrice.eseguiOperazione(somma, 5, 3);

        System.out.println("Eseguo Moltiplicazione:");
        Calcolatrice.eseguiOperazione(moltiplicazione, 5, 3);
    }
}
