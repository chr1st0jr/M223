package Klassendiagrammbeispiel;

import java.util.List;

public class Person {
    private String name;
    private String vorname;
//  entweder eine Arrayliste oder Array machen, um die Beziehung zu Velo zu definieren.
    private List<Velo> velos;
    private Velo[] velos2;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public List<Velo> getVelos() {
        return velos;
    }

    public void setVelos(List<Velo> velos) {
        this.velos = velos;
    }

    public Velo[] getVelos2() {
        return velos2;
    }

    public void setVelos2(Velo[] velos2) {
        this.velos2 = velos2;
    }




}
