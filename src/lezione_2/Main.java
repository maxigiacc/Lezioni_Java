public class Main{
    public static void main(String[] args) {
        String nome = "Massimo";
        int eta = 23;

        Persona p = new Persona(nome, eta); 
        Persona p1 = new Persona();
        Persona p2 = new Persona("Giovanni");
        Persona p3 = new Persona(23);

        System.out.println("Nome: " + p.nome + " Eta: " + p.eta);
        System.out.println("Nome: " + p1.nome + " Eta: " + p1.eta + "\n");
        System.out.println("Nome: " + p2.nome + " Eta: " + p2.eta + "\n");
        System.out.println("Nome: " + p3.nome + " Eta: " + p3.eta + "\n");
    }
}