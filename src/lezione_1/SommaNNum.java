public class SommaNNum {
    public static void main(String[] args) {
        int N = 100;
        int somma = 0;

        int array [] = new int[3];

        for (int i = 0; i < 3; i++){
            array[i] = 0;
        }

        for (int i = 1; i <= N; i++) {
            somma += i;
        }

        System.out.println("Somma dei primi " + N + " numeri: " + somma);
    }
}
