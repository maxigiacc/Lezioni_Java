public class Main {

    public static void main(String[] args) {
        
        Libro l1 = new Libro("1984", "George Orwell", 1949);
        Libro l2 = new Libro("Algoritmi", "Domingues");

        System.out.println("========= PRIMO LIBRO =========");
        l1.stampa();
        System.out.println("========= SECONDO LIBRO =========");
        l2.stampa();

        if(l1.equals(l2)) {
            System.out.println("I due libri risultano uguali\n");
        }
        else {
            System.out.println("I due libri NON risultano uguali");
        }

        if(l1 == l2) {
            System.out.println("I due libri risultano uguali\n");
        }
        else {
            System.out.println("I due libri NON risultano uguali");
        }
    }
}