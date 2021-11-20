package M223_TEST_LB3;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class iTicketDAOTest {

    @Test
    public void insert() {
        iTicketDAO t = new TicketDAO();
        Ticket ticket = new Ticket();
        ticket.setFilmvorfuehrungsnummer(2);
        ticket.setReihe(5);
        ticket.setPlatz(4);
        ticket.setKundennummer(50);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd.MM.yyyy");
        LocalDate datum = LocalDate.parse("01.01.2020", dtf);
        ticket.setDate(datum);
        ticket.setBewertung(5);
        int anzahl = t.insert(ticket);
        assertEquals(1, anzahl);
    }

    @Test
    public void select() {
        iTicketDAO dao = new TicketDAO();
        ArrayList<Ticket> list = dao.select();
        for (Ticket ticket: list)
            System.out.println(ticket);
        assertTrue(true);
    }

    @Test
    public void update() {
        iTicketDAO dao = new TicketDAO();
        Ticket ticket = new Ticket();
        ticket.setFilmvorfuehrungsnummer(2);
        ticket.setReihe(2);
        ticket.setPlatz(4);
        ticket.setTicketnummer(1);
        int anz = dao.update(ticket);
        assertEquals(1, anz);
    }

    @Test
    public void delete() {
        iTicketDAO dao = new TicketDAO();
        Ticket ticket = new Ticket();
        ticket.setTicketnummer(3);
        int anz = dao.delete(ticket);
        assertEquals(1, anz);
    }
}