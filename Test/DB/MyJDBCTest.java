package DB;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class MyJDBCTest {

    @Test
    public void con() throws SQLException {
        MyJDBC jdbc = new MyJDBC();
//        assertEquals(expected, jdbc.con());
        assertNotNull("Successfull", jdbc.con());
    }
}