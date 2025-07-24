class Lettore extends DispositivoMultimediale {
    public Lettore() {
        super("Lettore Audio");
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione audio...");
    }

    @Override
    public void pausa() {
        System.out.println("Audio in pausa.");
    }

    @Override
    public void stop() {
        System.out.println("Audio arrestato.");
    }
}

class LettoreVideo extends DispositivoMultimediale {
    public LettoreVideo() {
        super("Lettore Video");
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione video...");
    }

    @Override
    public void pausa() {
        System.out.println("Video in pausa.");
    }

    @Override
    public void stop() {
        System.out.println("Video arrestato.");
    }

    @Override
    public void avanza(int secondi) {
        System.out.println("Avanzamento video di " + secondi + " secondi.");
    }
}

class DispositivoCombinato extends DispositivoMultimediale {
    public DispositivoCombinato() {
        super("Dispositivo Combinato");
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione audio/video...");
    }

    @Override
    public void pausa() {
        System.out.println("Pausa combinata.");
    }

    @Override
    public void stop() {
        System.out.println("Stop combinato.");
    }
}
