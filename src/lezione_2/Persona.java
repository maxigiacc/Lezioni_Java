public class Persona {
    String nome;
    int eta;

    //costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public Persona(String nome) {
        this.nome = nome;
        this.eta = -1;
    }

    public Persona(int eta) {
        this.eta = eta;
        this.nome = "";
    }   

    public Persona() {
        this.eta = 0;
        this.nome = "";
    }
}