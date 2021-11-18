package Konto;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KontoDAOTest {
    @Test
    public void bezug() {
//      Hier muss man die Klasse instanziieren, achtung nicht das interface!
//        iKontoDAO dao = new KontoDAO();
        iKontoDAO dao = new VerbesserteKontoDAO();
        boolean b = dao.bezug(5,2345);
        assertTrue(b);
    }

    /*@Test
    public void bezug() {
        int KontoNr = 1;
        double betrag = 5;
//      Objekt instanziieren
        KontoDAO kontoDAO = new KontoDAO();
        boolean successfull = kontoDAO.bezug(KontoNr,betrag);
        assertTrue(successfull);
    }*/

}