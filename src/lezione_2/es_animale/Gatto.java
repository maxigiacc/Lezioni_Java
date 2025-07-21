public class Gatto extends Animale {
    private String razza;

    public Gatto(String nome, String razza) {
        super(nome);
        this.razza = razza;
    }

    @Override
    public void parla() {
        super.parla();
        System.out.println("Miao! Sono un gatto di razza " + this.razza);
    }

}