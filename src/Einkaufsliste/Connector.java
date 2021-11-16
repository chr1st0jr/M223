package Einkaufsliste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    Connection connection = null;
    private static Connector connector = new Connector();

    public static Connector getConnector() {
        return connector;
    }

    public Connection con() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found");
        }
        try {
            if (connection == null || connection.isClosed())
              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223", "root", "");
        } catch (SQLException s) {
            System.out.println("SQL connection failed");

        }
        return connection;
    }
}
