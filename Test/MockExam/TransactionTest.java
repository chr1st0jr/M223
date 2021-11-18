package MockExam;

import Ticketkauf.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void updateTable() {
        Transaction t = new Transaction();
        Person p = new Person(2,"Cheruparambil","Charles",null,false,20,10.00);
        int i = t.updateTable(p);
        assertEquals(1, i);
    }
}