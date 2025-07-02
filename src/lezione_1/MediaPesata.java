public class MediaPesata {
    public static void main(String[] args) {
        double voto1 = 6.5, voto2 = 8.0, voto3 = 7.0;
        double peso1 = 0.3, peso2 = 0.5, peso3 = 0.2;

        double media = calcolaMedia(voto1, peso1, voto2, peso2, voto3, peso3);
        System.out.println("Media pesata: " + media);
    }

    public static double calcolaMedia(double v1, double p1, double v2, double p2, double v3, double p3) {
        return v1 * p1 + v2 * p2 + v3 * p3;
    }
}
