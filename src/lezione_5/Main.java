public class Main {
    public static void main(String[] args) {
        VeicoloBase v = new MotorBike();
        v.accendi();
        System.out.println(v.consumo());
    }
}