public class PariDispari{
    public static void main(String[] args) {
        int numero = 17;

        if (isPari(numero)) {
            System.out.println(numero + " è pari");
        } else {
            System.out.println(numero + " è dispari");
        }
    }

    public static boolean isPari(int n) {
        return n % 2 == 0;
    }
}
