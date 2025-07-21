public class Es1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int quoziente = a / b;
            System.out.println("Quoziente: " + quoziente);
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero.");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Errore: fornisci due numeri interi come argomenti.");
        }
    }
}