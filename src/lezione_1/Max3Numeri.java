public class Max3Numeri {
    public static void main(String[] args) {
        int a = 12, b = 42, c = 27;

        int max = massimo(a, b, c);
        System.out.println("Il massimo è: " + max);
    }

    public static int massimo(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}
