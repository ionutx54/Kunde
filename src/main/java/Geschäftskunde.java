// package testat1_aufgabe4;

public class Geschäftskunde extends Kunde {
    private static final long serialVersionUID = 1L;

    public Geschäftskunde(Integer id,String name) {
        super(id,name);
    }

    @Override
    public String toString(){
        return "Ich bin ein Geschäftskunde mit der ID "+getId()+" und heiße "+getName()+"!";
    }

    // redundant, no need to override with the same implementation
    // an object of this type can use inherited equals method
//    @Override
//    public boolean equals(Object o){
//        if (o==null) return false;
//        if (this.getClass()!=o.getClass()) return false;
//        return hashCode()==o.hashCode();
//    }
}
