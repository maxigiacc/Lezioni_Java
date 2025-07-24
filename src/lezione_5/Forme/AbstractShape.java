// Classe astratta che può contenere logica comune (opzionale)
public abstract class AbstractShape implements Shape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}