package M223_TEST_LB3;

import java.sql.*;
import java.util.ArrayList;

public class TicketDAO implements iTicketDAO {

    public Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lb3", "root", "");

        } catch (Exception e) {
            System.out.println("SQL exception occured" + e);
        }
        return con;
    }

    @Override
    public int insert(Ticket ticket) {
        int anzahl = 0;
        try {
            Connection con = getConnection();
            con.setAutoCommit(false);
            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_ticket (Ticketnummer, Filmvorfuehrungsnummer, Reihe, Platz, Kundennummer, Datum, Bewertung)\n" +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setInt(1, ticket.getTicketnummer());
                ps.setInt(2, ticket.getFilmvorfuehrungsnummer());
                ps.setInt(3, ticket.getReihe());
                ps.setInt(4, ticket.getPlatz());
                ps.setInt(5, ticket.getKundennummer());
                ps.setDate(6, Date.valueOf(ticket.getDate()));
                ps.setInt(7, ticket.getBewertung());

                // Execute the UPDATE command
                anzahl = ps.executeUpdate();

                // Condition statement for a rollback case
                // A Reservation for the same car model must not be possible for the same date
                PreparedStatement psRead = con.prepareStatement("select Ticketnummer, Filmvorfuehrungsnummer, Reihe, Platz, Kundennummer, Datum, Bewertung from tbl_ticket where Ticketnummer = ?");
                psRead.setInt(1, ticket.getTicketnummer());
                ResultSet rs = psRead.executeQuery();
                int count = 0;
                while(rs.next()) {
                    count++;
                }
                if(count != 1) {
                    con.rollback();
                } else {
                    con.commit();
                }
                ps.close();
            }
            con.isClosed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return anzahl;
    }

    @Override
    public ArrayList<Ticket> select() {
        ArrayList<Ticket> ticketliste = new ArrayList<>();
        try {
            Connection con = getConnection();
            // Set Auto commit to false
            con.setAutoCommit(false);
            // Set transaction level
            con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement preparedStatement = con.prepareStatement("select Ticketnummer, Filmvorfuehrungsnummer, Reihe, Platz from tbl_ticket");

            // Execute the SELECT command
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                // Retrieve by column name
                Ticket ticket = new Ticket();
                ticket.setTicketnummer(rs.getInt("Ticketnummer"));
                ticket.setFilmvorfuehrungsnummer(rs.getInt("Filmvorfuehrungsnummer"));
                ticket.setReihe(rs.getInt("Reihe"));
                ticket.setPlatz(rs.getInt("Platz"));
                ticketliste.add(ticket);
                // Commit transaction
                con.commit();
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ticketliste;
    }

    @Override
    public int update(Ticket ticket) {
        int anz = 0;
        try {
            Connection con = getConnection();
            con.setAutoCommit(false);
            if (!con.isClosed()) {
                PreparedStatement preparedStatement = con.prepareStatement("UPDATE tbl_ticket SET Filmvorfuehrungsnummer = ?, Reihe = ?, " +
                        "Platz = ? WHERE Ticketnummer = ?" );
                preparedStatement.setInt(1, ticket.getFilmvorfuehrungsnummer());
                preparedStatement.setDouble(2, ticket.getReihe());
                preparedStatement.setInt(3, ticket.getPlatz());
                preparedStatement.setInt(4,ticket.getTicketnummer());
                anz = preparedStatement.executeUpdate();

                PreparedStatement psRead = con.prepareStatement("select Ticketnummer, Filmvorfuehrungsnummer, Reihe, Platz, Kundennummer, Datum, Bewertung from tbl_ticket where Ticketnummer = ?");
                psRead.setInt(1, ticket.getTicketnummer());
                ResultSet rs = psRead.executeQuery();
                int count = 0;
                while(rs.next()) {
                    count++;
                }
                if(count != 1) {
                    con.rollback();
                } else {
                    con.commit();
                }
                preparedStatement.close();
            }
            con.isClosed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return anz;
    }

    @Override
    public int delete(Ticket ticket) {
        int anz = 0;
        try {
            Connection con = getConnection();
            con.setAutoCommit(false);
            if (!con.isClosed()) {
                PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM tbl_ticket WHERE Ticketnummer = ?" );
                preparedStatement.setInt(1, ticket.getTicketnummer());
                anz = preparedStatement.executeUpdate();
                preparedStatement.close();

                PreparedStatement psRead = con.prepareStatement("select Ticketnummer, Filmvorfuehrungsnummer, Reihe, Platz, Kundennummer, Datum, Bewertung from tbl_ticket where Ticketnummer = ?");
                psRead.setInt(1, ticket.getTicketnummer());
                ResultSet rs = psRead.executeQuery();
                int count = 0;
                while(rs.next()) {
                    count++;
                }
                if(count != 1) {
                    con.rollback();
                } else {
                    con.commit();
                }
                preparedStatement.close();
            }
            con.isClosed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return anz;
    }
}
