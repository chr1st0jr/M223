package Klassendiagrammbeispiel;

public class Velo {
    private String marke;
    private int anzahlGaenge;
    Boolean lichtVorne;
    Boolean lichtHinten;

    public Velo(String marke, int anzahlGaenge, Boolean lichtVorne, Boolean lichtHinten, Person person) {
        this.marke = marke;
        this.anzahlGaenge = anzahlGaenge;
        this.lichtVorne = lichtVorne;
        this.lichtHinten = lichtHinten;
        this.person = person;
    }

    private Person person;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getAnzahlGaenge() {
        return anzahlGaenge;
    }

    public void setAnzahlGaenge(int anzahlGaenge) {
        this.anzahlGaenge = anzahlGaenge;
    }

    public Boolean getLichtVorne() {
        return lichtVorne;
    }

    public void setLichtVorne(Boolean lichtVorne) {
        this.lichtVorne = lichtVorne;
    }

    public Boolean getLichtHinten() {
        return lichtHinten;
    }

    public void setLichtHinten(Boolean lichtHinten) {
        this.lichtHinten = lichtHinten;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return this.marke;
    }
}
