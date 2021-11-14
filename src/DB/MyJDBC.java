package DB;

import Ticketkauf.Person;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {


    public Connection con() {
        Connection connection = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found");
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/m223", "root", "");
        } catch (SQLException s) {
            System.out.println("SQL connection failed");
            ;
        }
        System.out.println("User: Root\n" +
                "Password: ''");
        return connection;
    }


//                Statement statement = connection.createStatement();

    // Update Query
//            statement.executeUpdate("INSERT INTO tbl_person (ID, Nachname, Vorname) "
//                    +"VALUES ('8','Fred', 'Flinstone')");

//            ResultSet resultSet = statement.executeQuery("select * from tbl_person");


//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("ID"));
//                System.out.println(resultSet.getString("Nachname"));
//                System.out.println(resultSet.getString("Vorname"));
//            }


//            if (statement != null) statement.close();


//    PreparedStatement pstmt = connection.prepareStatement("insert into tbl_person (ID, Nachname, Vorname, " +
//            "Geburtsdatum, Over18, Anzahl, Preis") values( ?);

    //
    public int insert(Person p) {
        Connection connection = con();
     /*   try {

        }
            if (!con().isClosed()) {
              PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement("insert into tbl_person (ID, Nachname, Vorname, " +
              "Geburtsdatum, Over18, Anzahl, Preis) values ( ?, ?, ?, ?, ?, ?)");

              pstmt.setInt(1,p.getID());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return int;

    }*/
        return 0;
    }

}