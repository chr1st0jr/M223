package Konto;

public interface iKontoDAO{
    /*Um interface zu erstellen, muss man zuerst auf new-> interface und dann denn Namen mit i zuvor schreiben
    (iKontoDAO). Danach schreibt man alle möglichen Methoden, die man letztlich in anderen Klassen
    überschreiben möchte.*/
    boolean bezug(int KontoNr, double betrag);

}
