public class Main {
    public static void main(String[] args) {
        Salvadanaio s = new Salvadanaio(100);

        try {
            s.preleva(30);
            s.preleva(80);
        } catch (SaldoInsufficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}