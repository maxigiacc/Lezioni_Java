public class Es2 {

    public static void main(String[] args) {
        stampaLunghezza("Ciao");
        try {
            stampaLunghezza(null);
        } catch (Exception e) {
            System.out.println("Errore: stringa nulla");
            System.out.println(e.getMessage());;
        }
    }

    public static void stampaLunghezza(String s) throws NullPointerException{
        System.out.println("Lunghezza stringa: " + s.length());
    }
}