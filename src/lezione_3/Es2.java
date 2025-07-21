public class Es2{
     public static void stampaLunghezza(String s) {
        try {
            System.out.println("Lunghezza: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("Attenzione: la stringa è null.");
        }
    }

    public static void main(String[] args) {
        stampaLunghezza("Ciao");
        stampaLunghezza(null);
    }
}