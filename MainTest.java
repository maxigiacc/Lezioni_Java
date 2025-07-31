import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    public int somma(int a, int b) {
        return a + b;
    }

    public boolean importa(String nomeFile) {

        //vedo se il file è esiste aperto etc etc
        boolean result = false;
        //leggo il file e recupero quello che mi serve
        result = true;

        return result;
    }



    @Test
    public void testSomma() {
        assertEquals(4, somma(2, 2));
    }

    @Test
    public void testImport() {
        assertEquals(true, importa("Fattura.txt"));
        assertEquals(false,importa("Import.txt"));
    }

}
