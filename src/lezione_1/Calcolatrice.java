public class Calcolatrice {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 5.0;
        char operazione = '*';

        double risultato = 0;

        switch (operazione) {
            case '+': risultato = a + b; break;
            case '-': risultato = a - b; break;
            case '*': risultato = a * b; break;
            case '/':
                if (b != 0) {
                    risultato = a / b;
                } else {
                    System.out.println("Errore: divisione per zero");
                    return;
                }
                break;
            default:
                System.out.println("Operazione non valida");
                return;
        }

        System.out.println("Risultato: " + risultato);
    }
}
