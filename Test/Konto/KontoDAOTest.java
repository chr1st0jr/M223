package Konto;

import org.junit.Test;

import static org.junit.Assert.*;

public class KontoDAOTest {

    @Test
    public void bezug() {
        int KontoNr = 1;
        double betrag = 5;
//      Objekt instanziieren
        KontoDAO kontoDAO = new KontoDAO();
        boolean successfull = kontoDAO.bezug(KontoNr,betrag);
        assertTrue(successfull);
    }
}