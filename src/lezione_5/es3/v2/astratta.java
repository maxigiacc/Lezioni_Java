abstract class DispositivoMultimediale {
    protected String nome;

    public DispositivoMultimediale(String nome) {
        this.nome = nome;
    }

    public abstract void riproduci();

    public String getNome() {
        return nome;
    }

    // Metodi opzionali, non tutti li sovrascrivono
    public void pausa() {
        throw new UnsupportedOperationException("Funzione non supportata.");
    }

    public void stop() {
        throw new UnsupportedOperationException("Funzione non supportata.");
    }

    public void avanza(int secondi) {
        throw new UnsupportedOperationException("Funzione non supportata.");
    }
}
