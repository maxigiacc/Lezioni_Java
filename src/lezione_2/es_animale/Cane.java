public class Cane extends Animale {
    private String razza;

    public Cane(String nome, String razza) {
        super(nome);
        this.razza = razza;
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("Sono un cane di razza " + this.razza);
    }

}