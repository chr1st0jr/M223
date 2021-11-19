package M223_TEST_LB3;

import java.time.LocalDate;

public class Ticket {
    int Ticketnummer;
    int Filmvorfuehrungsnummer;
    int Reihe;
    int Platz;
    int Kundennummer;
    String Nachname;
    String Vorname;
    LocalDate date;
    int Bewertung;

    public int getTicketnummer() {
        return Ticketnummer;
    }

    public void setTicketnummer(int ticketnummer) {
        Ticketnummer = ticketnummer;
    }


    public int getFilmvorfuehrungsnummer() {
        return Filmvorfuehrungsnummer;
    }

    public void setFilmvorfuehrungsnummer(int filmvorfuehrungsnummer) {
        Filmvorfuehrungsnummer = filmvorfuehrungsnummer;
    }

    public int getReihe() {
        return Reihe;
    }

    public void setReihe(int reihe) {
        Reihe = reihe;
    }

    public int getPlatz() {
        return Platz;
    }

    public void setPlatz(int platz) {
        Platz = platz;
    }

    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBewertung() {
        return Bewertung;
    }

    public void setBewertung(int bewertung) {
        Bewertung = bewertung;
    }
}
