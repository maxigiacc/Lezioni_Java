public class VerificaPrimo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Utilizzo: java VerificaPrimo <numero>");
            return;
        }
        // Controllo che l'argomento sia un numero intero
        int numero = Integer.parseInt(args[0]);

        if (isPrimo(numero)) {
            System.out.println(numero + " è un numero primo");
        } else {
            System.out.println(numero + " non è un numero primo");
        }
    }

    public static boolean isPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
