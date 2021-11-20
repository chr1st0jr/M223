package M223_TEST_LB3;

import java.util.ArrayList;

public interface iTicketDAO {
    public int insert(Ticket ticket);
    public ArrayList<Ticket> select() ;
    public int update(Ticket ticket);
    public int delete(Ticket ticket);

}
