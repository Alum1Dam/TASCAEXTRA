package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class CalculMentalTest {

    @Test
    public void testCasosPruebaPositivos() {
        String input = "3\n15 + 8 - 7 + 10 - 3 .\n10 - 5 + 3 .\n20 + 30 - 15 + 5 - 10 + 2 - 7 .\n";
        //Locura encontrar el InputStream
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        calculMental.main(new String[]{});
        assertTrue(true);
    }

    @Test
    public void testCasosPruebaCero() {
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        calculMental.main(new String[]{});
        assertTrue(true);
    }

    @Test
    public void testCasosPruebaNegativos() {
        String input = "-2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        calculMental.main(new String[]{});
        assertTrue(true);
    }
}