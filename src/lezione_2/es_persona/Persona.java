public class Persona {
    protected String nome;
    protected String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nome" + this.nome + "\n");
        str.append("Cognome" + this.cognome);

        return str.toString();
    }
}