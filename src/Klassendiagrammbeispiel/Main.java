package Klassendiagrammbeispiel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person heidi = new Person();
        Person hans = new Person();

        ArrayList<Velo> velo_hans = new ArrayList<Velo>();
        ArrayList<Velo> velo_heidi = new ArrayList<Velo>();

        Velo citybike = new Velo("speed", 8,true, false, hans);
        Velo mountainbike = new Velo("yamaha", 8,true, true, hans);

        Velo leisurebike = new Velo("bmw", 6,false,false, heidi);

        velo_hans.add(citybike);
        velo_hans.add(mountainbike);

        velo_heidi.add(leisurebike);




        heidi.setVelos(velo_heidi);
        hans.setVelos(velo_hans);





        citybike.setPerson(hans);
        mountainbike.setPerson(hans);

        System.out.println("Velos von Hans " + hans.getVelos());




    }
}
