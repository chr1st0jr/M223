package Einkaufsliste;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EinkaufDAO{


    public int insert(Model model) throws SQLException {

        int anzahl = 0;

        Connector connector = Connector.getConnector();


        PreparedStatement psinsert = null;
        try {
            psinsert = connector.con().prepareStatement("insert into tbl_einkaufsliste (Artikel, Preis, Menge, Beschreibung, Datum)" +
                    " values (Artikel = ?, Preis = ?, Menge = ?, Beschreibung = ?, Datum = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        psinsert.setString(1, model.getArtikel());
        psinsert.setDouble(2, model.getPreis());
        psinsert.setInt(3, model.getMenge());
        psinsert.setString(4, model.getBeschreibung());
        psinsert.setDate(5, Date.valueOf(model.getDatum()));
        psinsert.executeUpdate();


        connector.con().commit();

        return anzahl;
    }

}

