package MockExam;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    public static Connection con;
    public static Statement stmt;

    //  eine Methode für Connection
    public static boolean con() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LB3","root", "");
            stmt = con.createStatement();
            con.setAutoCommit(false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }



    }

    public static Connection getConnection(){
        return con;
    }

    public static boolean closeConnection(){
        try{
            con.close();
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

}
