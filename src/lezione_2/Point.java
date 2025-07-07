public class Point {
    private double x;
    private double y;
    private double z;

    // 1. Costruttore "completo" per un punto 3D
    // Questo costruttore contiene la logica principale di inizializzazione
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Costruttore 3D chiamato: (" + x + ", " + y + ", " + z + ")");
    }

    // 2. Costruttore per un punto 2D (chiamata al costruttore 3D con z=0)
    // Usa this() per riutilizzare la logica del costruttore più completo
    public Point(double x, double y) {
        this(x, y, 0); // La chiamata a this() deve essere la prima istruzione!
        System.out.println("Costruttore 2D chiamato: (" + x + ", " + y + ") -> Delega al 3D con z=0");
    }

    // 3. Costruttore di default (chiamata al costruttore 2D con x=0, y=0)
    // Utile per creare un punto all'origine
    public Point() {
        this(0, 0); // Delega al costruttore 2D
        System.out.println("Costruttore di default chiamato: () -> Delega al 2D con x=0, y=0");
    }

    // Metodi getter per accedere alle coordinate
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Metodo main per testare i costruttori
    public static void main(String[] args) {
        System.out.println("Creazione di oggetti Point:");

        // Usa il costruttore 3D direttamente
        Point p1 = new Point(1.0, 2.0, 3.0);
        System.out.println("Punto p1: (" + p1.getX() + ", " + p1.getY() + ", " + p1.getZ() + ")\n");

        // Usa il costruttore 2D, che delega al 3D
        Point p2 = new Point(4.0, 5.0);
        System.out.println("Punto p2: (" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")\n");

        // Usa il costruttore di default, che delega al 2D (e poi al 3D)
        Point p3 = new Point();
        System.out.println("Punto p3: (" + p3.getX() + ", " + p3.getY() + ", " + p3.getZ() + ")\n");
    }
}