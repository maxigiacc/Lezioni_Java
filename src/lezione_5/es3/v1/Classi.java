class LettoreAudio implements Riproducibile, Pausabile, Arrestabile {
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

class LettoreVideo implements Riproducibile, Pausabile, Arrestabile, Avanzabile {
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

class DispositivoCombinato implements Riproducibile, Pausabile, Arrestabile {
    @Override
    public void riproduci() {
        System.out.println("Riproduzione combinata audio/video...");
    }

    @Override
    public void pausa() {
        System.out.println("Pausa su dispositivo combinato.");
    }

    @Override
    public void stop() {
        System.out.println("Stop su dispositivo combinato.");
    }
}
