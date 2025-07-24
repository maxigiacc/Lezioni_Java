abstract class VeicoloBase {
    abstract double consumo();
    void accendi() {
        System.out.println("Motore acceso");
    }
}

class MotorBike extends VeicoloBase {

    @Override
    double consumo() {
        return 3 * 0.6;
    }

}

