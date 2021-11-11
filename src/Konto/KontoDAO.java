package Konto;

import java.sql.*;

public class KontoDAO {
    //Bezug von x Franken (z.B. 50)

    public Connection con() {
        Connection connection = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found");
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/konto", "root", "");
            connection.setAutoCommit(false);
        } catch (SQLException s) {
            System.out.println("SQL connection failed");
            ;
        }
        return connection;
    }

    public boolean bezug(int KontoNr, double betrag){
        double kontostand;

//      Verbindung aufbauen
        Connection connection = con();

//      Kontostand abfragen(Select)
        try {
            if(!connection.isClosed()){
                PreparedStatement pstmt = connection.prepareStatement("select KontoNr, Betrag from tbl_konto");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()){
                    if (rs.getInt("KontoNr") == KontoNr){
                        if (rs.getInt("Betrag") - betrag >= 0){
                            kontostand= rs.getInt("Betrag") - betrag;
                            System.out.println("Kontostand:" + kontostand);
                            PreparedStatement psupdate = connection.prepareStatement("update tbl_konto set" +
                                    " betrag = ? where KontoNr = ?");
                            psupdate.setInt(2, KontoNr);
                            psupdate.setDouble(1,kontostand);
                            psupdate.executeUpdate();
                            connection.commit();
                        }
                        else{
                            System.out.println("Saldo zu klein");
                        }
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return true;
    }
}
