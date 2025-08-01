// Classe Main per testare il sistema
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 7),
            new Rombo(5, 5)
        };

        for (Shape shape : shapes) {
            if (shape instanceof AbstractShape) {
                System.out.println(((AbstractShape) shape).getName() + " - Area: " + shape.getArea());
            } else {
                System.out.println("Area: " + shape.getArea());
            }
        }
    }
}



/*                      SHAPE            (INTERFACCIA)              SHAPE
 *                        ^
 *                        |
 *                 ABSTRACT SHAPE (CLASSE ASTRATTA)                    
 *                       ^                 
 *                       |   
 *              CIRCLE/RECTANGLE/TRIANGLE.                                      ROMBO
 * 
 */