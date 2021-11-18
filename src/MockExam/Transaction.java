package MockExam;

import Ticketkauf.Person;

import java.sql.*;
import java.util.ArrayList;

import static MockExam.JDBC.con;
import static MockExam.JDBC.getConnection;


/*Optimistisch: Zuerst Update und dann Select
Pessimistisch: Zuerst Select und dann update*/

public class Transaction {

    public ArrayList<Person> viewTable() {
        ArrayList<Person> list = new ArrayList<Person>();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223","root", "");
            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement preparedStatement = con.prepareStatement("select ID, Nachname, Vorname, Geburtsdatum, Over18, Anzahl, Preis from tbl_person");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                // Retrieve by column name
                Person p = new Person();
                p.setID(rs.getInt("ID"));
                p.setName(rs.getString("Nachname"));
                p.setVorname(rs.getString("Vorname"));
                p.setGeburtsdatum(rs.getDate("GeburtsDatum").toLocalDate());
                p.setVolljährig(rs.getBoolean("Over18"));
                p.setAnzahl(rs.getInt("Anzahl"));
                p.setPreis(rs.getDouble("Preis"));
                list.add(p);
                con.commit();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int insertTable(Person p) {
        int anzahl = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223","root", "");
            if (!con.isClosed()) {
                PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO tbl_person (Nachname, Vorname, Geburtsdatum, Over18, Anzahl, Preis)\n" +
                        "VALUES (?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, p.getName());
                preparedStatement.setString(2, p.getVorname());
                preparedStatement.setDate(3, Date.valueOf(p.getGeburtsdatum()));
                preparedStatement.setBoolean(4, p.getVolljährig());
                preparedStatement.setInt(5, p.getAnzahl());
                preparedStatement.setDouble(6, p.getPreis());
                anzahl = preparedStatement.executeUpdate();
                if (anzahl != 1) {
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
        return anzahl;
    }

    public int updateTable(Person p) {
        int anzahl = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223","root", "");

            if (!con.isClosed()) {
                PreparedStatement preparedStatement = con.prepareStatement("UPDATE  tbl_person set Nachname = ?, Vorname = ? where ID = ?");
                preparedStatement.setString(1, "Müller");
                preparedStatement.setString(2, "Thomas");
                preparedStatement.setInt(3, 2);
                anzahl = preparedStatement.executeUpdate();
                preparedStatement.close();
            }
            con.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return anzahl;
    }

    public int deleteTable(Person p) {
        int anzahl = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223","root", "");
            if (!con.isClosed()) {
                PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM tbl_person WHERE ID = ?" );
                preparedStatement.setInt(1,p.getID());
                anzahl = preparedStatement.executeUpdate();
                preparedStatement.close();
            }
            con.isClosed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return anzahl;
    }
}
