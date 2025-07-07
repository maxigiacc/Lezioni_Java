public class Libro {

    private String titolo;
    private String autore;
    private int data_pubblicazione;

    public Libro (String titolo, String autore, int data_pubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.data_pubblicazione = data_pubblicazione;
    }

    public Libro(String titolo, String autore) {
        this(titolo, autore, -1);
    }

    public Libro(String titolo) {
        this(titolo, "", -1);
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public int getData() {
        return this.data_pubblicazione;
    }

    public void stampa() {
        System.out.println("Titolo del libro: " + this.titolo);
        System.out.println("Autore: " + this.autore);
        System.out.println("Data pubblicazione: " + this.data_pubblicazione);
    }

    public boolean equals(Libro l1) {
        boolean risultato = false;
        if (this.titolo.equalsIgnoreCase(l1.titolo) && this.autore.equalsIgnoreCase(l1.autore)) {
            risultato = true;
        }
        return risultato;
    }

}