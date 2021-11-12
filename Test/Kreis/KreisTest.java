package Kreis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KreisTest {

    @Test
    public void umfang() {
        double radius;
        Kreis k = new Kreis();
        assertEquals(12.566370614359172,k.umfang(2), 0);
    }

    @Test
    public void flaeche() {
        double radius;
        Kreis k = new Kreis();
        assertEquals(12,k.flaeche(2),1);
    }

    @Test
    public void durchmesser() {
        double radius;
        Kreis k = new Kreis();
        assertEquals(4,k.durchmesser(2),1);
    }
}