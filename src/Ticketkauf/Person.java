package Ticketkauf;

import java.util.Date;

public class Person {
    String name;
    String vorname;
    Date geburtsdatum;
    Boolean volljaehrig;
    Integer anzahl;
    Double preis;

    public Person(String name, String vorname, Date geburtsdatum, Boolean volljaehrig, Integer anzahl, Double preis) {
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

    public Date getGeburtsdatum() {
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

    public void setGeburtsdatum(Date geburtsdatum) {
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
}
