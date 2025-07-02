public class SommaNNum {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // Legge il numero N dalla riga di comando
        int somma = 0;

        for (int i = 1; i <= N; i++) {
            somma += i;
        }

        System.out.println("Somma dei primi " + N + " numeri: " + somma);
    }
}
