//package testat1_aufgabe4;

import java.io.Serializable;

public class Kunde implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private static int anzahl=0;

    public Kunde(Integer id,String name){
        // NULL, 2 Zeichen -> ggf. priv. Setter
        this.name=name;
        // ist ID gültig -> ggf. priv. Setter
        this.id=id;
        incAnzahl();
    }

    public static void setAnzahl(int anzahl){
        Kunde.anzahl=anzahl;
    }
    public static int getAnzahl(){
        return anzahl;
    }
    public static void incAnzahl(){
        anzahl++;
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Ich bin ein Kunde mit der ID "+getId()+" und heiße "+getName()+"!";
    }

    @Override
    public int hashCode(){
        // return name.hashCode();
        return id;
    }

    @Override
    public boolean equals(Object o){
        if (o==null) return false;
        if (this.getClass()!=o.getClass()) return false;
        return hashCode()==o.hashCode();
    }

    @Override
    public void finalize(){
        System.out.println("Ich bin ein Kunde mit der ID "+getId()+" und ICH STERBE!");
    }
}
