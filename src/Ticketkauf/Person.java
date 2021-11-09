package Ticketkauf;

import java.time.LocalDate;

public class Person {
    int ID;
    String name;
    String vorname;
    LocalDate geburtsdatum;
    Boolean volljaehrig;
    Integer anzahl;
    Double preis;

    public Person(int ID, String name, String vorname, LocalDate geburtsdatum, Boolean volljaehrig, Integer anzahl, Double preis) {
        this.ID = ID;
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.volljaehrig = volljaehrig;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public Boolean getVolljährig() {
        return volljaehrig;
    }

    public Integer getAnzahl() {
        return anzahl;
    }

    public Double getPreis() {
        return preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setVolljährig(Boolean volljährig) {
        this.volljaehrig = volljährig;
    }

    public void setAnzahl(Integer anzahl) {
        this.anzahl = anzahl;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
