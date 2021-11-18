package Konto;

public class KontoDAOFactory {
    private static double version = 1.0;

    public static iKontoDAO createKontoDAO(){
        if(version >= 2)
            return new VerbesserteKontoDAO();
        else
            return new KontoDAO();
    }
}
