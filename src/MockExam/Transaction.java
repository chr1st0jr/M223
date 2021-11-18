package MockExam;

import Ticketkauf.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static MockExam.JDBC.con;
import static MockExam.JDBC.getConnection;

public class Transaction {

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
}
