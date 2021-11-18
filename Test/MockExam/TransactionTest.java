package MockExam;

import Ticketkauf.Person;
import org.junit.Test;


import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void updateTable() {
        Transaction t = new Transaction();
        Person p = new Person();
        p.setID(2);
        p.setName("Cheruparambil");
        p.setVorname("Charles");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate datum = LocalDate.parse("05.01.2021", dtf);
        Date sqlDate = Date.valueOf(datum);
        p.setGeburtsdatum(datum);
        p.setAnzahl(10);
        p.setPreis(4.33);
        p.setVolljährig(false);
        int i = t.updateTable(p);
        assertEquals(1, i);
    }

    @Test
    public void viewTable() {
        Transaction dao = new Transaction();
        ArrayList<Person> list = dao.viewTable();
        for (Person p : list)
            System.out.println(p.getVorname());
        assertTrue(true);
    }


    @Test
    public void insertTable() {
        Transaction dao = new Transaction();
        Person p = new Person();
        p.setName("Baker");
        p.setVorname("John");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd.MM.yyyy");
        LocalDate datum = LocalDate.parse("01.01.2020", dtf);
        //LocalDate datum2 = LocalDate.of(2000,1,1);
        Date sqlDate = Date.valueOf(datum);
        p.setGeburtsdatum(datum);
        p.setAnzahl(10);
        p.setPreis(5.55);
        p.setVolljährig(false);
        int anz = dao.insertTable(p);
        assertEquals(1, anz);
    }


    @Test
    public void deleteTable() {
        Transaction dao = new Transaction();
        Person p = new Person();
        p.setID(2);
        int anz = dao.deleteTable(p);
        assertEquals(1, anz);
    }

}