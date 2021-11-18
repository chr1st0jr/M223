package Konto;

import org.junit.Test;

import static org.junit.Assert.*;

public class iKontoDAOTest {

    @Test
    public void bezug() {
        iKontoDAO dao = KontoDAOFactory.createKontoDAO();
        boolean b = dao.bezug(5,2345);
        assertTrue(b);
    }

    @Test
    public void bezug2() {
        iKontoDAO dao = KontoDAOFactory.createKontoDAO();
        boolean b = dao.bezug(5,2345);
        assertTrue(b);
    }

    @Test
    public void bezug3() {
        iKontoDAO dao = KontoDAOFactory.createKontoDAO();
        boolean b = dao.bezug(5,2345);
        assertTrue(b);
    }
}