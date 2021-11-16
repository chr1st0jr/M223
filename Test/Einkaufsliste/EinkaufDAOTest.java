package Einkaufsliste;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EinkaufDAOTest {

    @Test
    public void insert() {
        LocalDate date = LocalDate.of(2021,12,04);
        Model model = new Model("Milch",2.00,5,"Miuch",date);
        EinkaufDAO einkaufDAO = EinkaufDAO();
        assertEquals(1,einkaufDAO.insert(model);
    }
}