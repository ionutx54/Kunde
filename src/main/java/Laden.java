// package testat1_aufgabe4;

import java.util.ArrayList;

public class Laden {

    public static void main(String[] args) {

        ArrayList<Kunde> kundenliste=new ArrayList<Kunde>();

        for(int kundeId = 0; kundeId < 2; kundeId++){
            kundenliste.add(new Kunde(kundeId, "Kunde" + kundeId));
            kundenliste.add(new Privatkunde(kundeId, "Privatkunde" + kundeId));
            kundenliste.add(new Geschäftskunde(kundeId, "Geschäftskundekunde" + kundeId));
        }

        System.out.println("Laden ist fertig!");

        // Check if List is empty, otherwise print it
        if(!kundenliste.isEmpty())
            System.out.println(kundenliste);


    }

}