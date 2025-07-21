public class Es1 {
    public static void main(String[] args) {
        try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int quoziente = a / b;
                System.out.println(quoziente);
        } catch (NumberFormatException e) {
            System.out.println("Errore: fornisci due interi come argomento");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java Es1 (intero) (intero)");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}