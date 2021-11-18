package MockExam;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class JDBCTest {

    @Test
    public void con() {
//        3 Schritte:
        /*- Objektinstanziierung
        - Methodenaufruf
        - Überprüfung*/
        JDBC con = new JDBC();
        boolean res = con.con();
        assertTrue(res);
    }

    @Test
    public void getConnection() {
        JDBC con = new JDBC();
        Connection res = con.getConnection();
        assertEquals("hallo", "\"jdbc:mysql://localhost:3306/m223\",\"root\",\"\"", res);

    }

    @Test
    public void closeConnection() {
        JDBC con = new JDBC();
        boolean res = con.closeConnection();
        assertTrue(res);
    }
}