//package testat1_aufgabe4;

import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Speichern {

    public static void main(String[] args) {
        ArrayList<Kunde> kundenliste=new ArrayList<Kunde>();

        System.out.println(Kunde.getAnzahl());

        kundenliste.add(new Kunde(0,"Müller"));
        kundenliste.add(new Privatkunde(1,"Schmidt"));
        kundenliste.add(new Privatkunde(2,"Schulz"));
        kundenliste.add(new Geschäftskunde(3,"Aronson"));
        kundenliste.add(new VIP(4,"Ziegler"));
        kundenliste.add(new Geschäftskunde(5,"Klinkenberg"));
        kundenliste.add(new Privatkunde(6,"Aksel"));

        System.out.println(Kunde.getAnzahl());

        for(Kunde k:kundenliste){
            System.out.println(k);
        }

        //TODO

    }
}
