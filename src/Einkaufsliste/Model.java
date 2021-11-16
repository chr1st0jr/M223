package Einkaufsliste;

import java.sql.Date;
import java.time.LocalDate;

public class Model {
    String Artikel;
    double Preis;
    int Menge;
    String Beschreibung;
    LocalDate Datum;

    public Model(String artikel, double preis, int menge, String beschreibung, LocalDate datum) {
        Artikel = artikel;
        Preis = preis;
        Menge = menge;
        Beschreibung = beschreibung;
        Datum = datum;
    }

    public String getArtikel() {
        return Artikel;
    }

    public void setArtikel(String artikel) {
        Artikel = artikel;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public int getMenge() {
        return Menge;
    }

    public void setMenge(int menge) {
        Menge = menge;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public Date getDatum() {
        return Date.valueOf(Datum);
    }

    public void setDatum(LocalDate datum) {
        Datum = datum;
    }
}
