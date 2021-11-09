package DB;

import Ticketkauf.Person;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) {
        Connection connection = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223","root","");

            Statement statement = connection.createStatement();

            // Update Query
            statement.executeUpdate("INSERT INTO tbl_person (ID, Nachname, Vorname) "
                    +"VALUES ('8','Fred', 'Flinstone')");

            ResultSet resultSet = statement.executeQuery("select * from tbl_person");


            while (resultSet.next()) {
                System.out.println(resultSet.getString("ID"));
                System.out.println(resultSet.getString("Nachname"));
                System.out.println(resultSet.getString("Vorname"));
            }


            if (statement != null) statement.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
