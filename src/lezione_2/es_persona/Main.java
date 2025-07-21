public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Gianni", "Morandi");
        Persona s1 = new Studente("Giovanni", "Keplero", "00120ASW0");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
    }
}