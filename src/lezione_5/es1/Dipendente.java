// Classe astratta
abstract class Dipendente {
    public abstract double calcolaStipendio();

    public void infoGenerali() {
        System.out.println("Dipendente azienda XYZ");
    }
}

// Classe concreta: Impiegato
class Impiegato extends Dipendente {
    private double stipendioMensile;

    public Impiegato(double stipendioMensile) {
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioMensile;
    }
}

// Classe concreta: Dirigente
class Dirigente extends Dipendente {
    private double stipendioBase;
    private double bonus;

    public Dirigente(double stipendioBase, double bonus) {
        this.stipendioBase = stipendioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase + bonus;
    }
}
