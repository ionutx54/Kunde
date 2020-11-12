import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Speichern_Loesung_CSV {

    public static void main(String[] args) {

        String path = "src/test.csv";
        File file = new File(path);
        ArrayList<Kunde> kundenliste = new ArrayList<Kunde>();
        List<String[]> lines = new ArrayList<String[]>();

        kundenliste.add(new Kunde(0, "Müller"));
        kundenliste.add(new Privatkunde(1, "Schmidt"));
        kundenliste.add(new Privatkunde(2, "Schulz"));
        kundenliste.add(new Geschäftskunde(3, "Aronson"));
        kundenliste.add(new VIP(4, "Ziegler"));
        kundenliste.add(new Geschäftskunde(5, "Klinkenberg"));
        kundenliste.add(new Privatkunde(6, "Aksel"));

        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            System.out.println(Kunde.getAnzahl());
            lines.add(new String[] {String.valueOf(Kunde.getAnzahl())});

            for (Kunde k : kundenliste) {
                System.out.println(k.getClass().getName() + " " + k.getName() + " " + k.getId());
                lines.add(new String[] {k.getClass().getName(), k.getName(), String.valueOf(k.getId())});
            }
            writer.writeAll(lines);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
