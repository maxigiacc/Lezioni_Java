public class Animale {
    protected String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void parla() {
        System.out.println("Sono un animale, mi chiamo: " + this.nome);
    }
}