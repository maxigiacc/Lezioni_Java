// Classe concreta: Triangolo
public class Triangle extends AbstractShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangolo");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}