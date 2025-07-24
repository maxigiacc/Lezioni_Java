// Classe concreta: Cerchio
public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        super("Cerchio");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}